package cc.ccoder.sell.order.client;

import cc.ccoder.sell.order.dto.CardDTO;
import cc.ccoder.sell.order.pojo.ProductInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * order服务调用product服务的接口
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 15:55:21
 */
@FeignClient(name = "product")
public interface ProductClient {

    /**
     * 测试使用
     *
     * @return 返回string
     */
    @GetMapping("/msg")
    String productMsg();

    /**
     * 商品id获取商品信息
     *
     * @param productIdList 商品id集合
     * @return 查询集合
     */
    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

    /**
     * 减库存操作
     * @param cardDTOList
     */
    @PostMapping("product/decreaseStock")
    void decreaseStock(@RequestBody List<CardDTO> cardDTOList);
}
