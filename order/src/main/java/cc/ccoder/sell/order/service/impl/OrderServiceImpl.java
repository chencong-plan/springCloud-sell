package cc.ccoder.sell.order.service.impl;

import cc.ccoder.sell.order.dto.OrderDTO;
import cc.ccoder.sell.order.enums.OrderStatusEnum;
import cc.ccoder.sell.order.enums.PayStatusEnum;
import cc.ccoder.sell.order.pojo.OrderMaster;
import cc.ccoder.sell.order.repository.OrderDetailRepository;
import cc.ccoder.sell.order.repository.OrderMasterRepository;
import cc.ccoder.sell.order.service.OrderService;
import cc.ccoder.sell.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:04:37
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //TODO 查询商品信息(调用商品服务)
        //TODO 计算总价
        //TODO 扣库存(调用商品服务)

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
