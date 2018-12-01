package cc.ccoder.sell.product.repository;

import cc.ccoder.sell.product.pojo.ProductCategory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author www.ccoder.cc
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 通过类目获取商品集合
     *
     * @param categoryTypeList 类目集合
     * @return 返回结果集合
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
