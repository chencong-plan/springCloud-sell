package cc.ccoder.sell.product.service;

import cc.ccoder.sell.product.pojo.ProductCategory;

import java.util.List;

/**
 * @author www.ccoder.cc
 */
public interface CategoryService {

    /**
     * 根据类别ID获取类目信息
     *
     * @param categoryTypeList 类目id集合
     * @return 返回查询结果
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
