package cc.ccoder.sell.order.service;

import cc.ccoder.sell.order.dto.OrderDTO;

/**
 * 订单服务
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 14:02:20
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO dto
     * @return dto
     */
    OrderDTO create(OrderDTO orderDTO);
}
