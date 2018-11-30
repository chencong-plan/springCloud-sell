package cc.ccoder.sell.product.service;

import cc.ccoder.sell.product.pojo.ProductInfo;

import java.util.List;

/**
 * @author www.ccoder.cc
 */
public interface ProductService {


    /**
     * 查询所有在架商品列表
     *
     * @return 返回查询结果
     */
    List<ProductInfo> findUpAll();
}
