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

    /**
     * 获取商品id集合获取商品信息
     *
     * @param productIdList 商品id集合
     * @return 返回查询结果
     */
    List<ProductInfo> findByProductIdIn(List<String> productIdList);

}
