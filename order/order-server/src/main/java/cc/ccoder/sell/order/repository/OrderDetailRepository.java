package cc.ccoder.sell.order.repository;

import cc.ccoder.sell.order.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单详情持久化接口
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 11:47:20
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
