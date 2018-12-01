package cc.ccoder.sell.order.repository;

import cc.ccoder.sell.order.pojo.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单持久化接口
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 11:47:08
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
