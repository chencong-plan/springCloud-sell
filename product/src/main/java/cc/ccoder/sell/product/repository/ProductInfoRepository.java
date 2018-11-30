package cc.ccoder.sell.product.repository;

import cc.ccoder.sell.product.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author www.ccoder.cc
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态获取商品
     *
     * @param productStatus 商户状态
     * @return 查询得到商品结果
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
