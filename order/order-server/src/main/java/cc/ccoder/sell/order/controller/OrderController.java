package cc.ccoder.sell.order.controller;

import cc.ccoder.sell.order.converter.OrderForm2OrderDTOConverter;
import cc.ccoder.sell.order.dto.OrderDTO;
import cc.ccoder.sell.order.enums.ResultEnum;
import cc.ccoder.sell.order.exception.OrderException;
import cc.ccoder.sell.order.form.OrderForm;
import cc.ccoder.sell.order.service.OrderService;
import cc.ccoder.sell.order.utils.ResultVOUtil;
import cc.ccoder.sell.order.vo.ResultVO;
import cc.ccoder.sell.product.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建订单
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 14:00:14
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    /**
     * order服务
     */
    private final OrderService orderService;

    private final ProductClient productClient;

    @Autowired
    public OrderController(OrderService orderService, ProductClient productClient) {
        this.orderService = orderService;
        this.productClient = productClient;
    }


    /**
     * 1. 参数检验
     * 2. 查询商品信息(调用商品服务)
     * 3. 计算总价
     * 4. 扣库存(调用商品服务)
     * 5. 订单入库
     */
    @PostMapping("/create")
    public ResultVO create(@Valid OrderForm orderForm,
                           BindingResult bindingResult) {
        log.info("进入order服务的create方法");
        if (bindingResult.hasErrors()){
            log.error("[创建订单]参数不正确, orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        // orderForm -> orderDTO
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("[创建订单]购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.create(orderDTO);

        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());
        return ResultVOUtil.success(map);
    }

    @GetMapping("/test")
    public ResultVO test(){
        return ResultVOUtil.success("成功");
    }

}
