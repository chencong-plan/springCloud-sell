package cc.ccoder.sell.product.service;

import cc.ccoder.sell.product.dto.CardDTO;
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


    /**
     * 查询商品列表
     *
     * @param productIdList 商品id集合
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     *
     * @param cardDTOList 库存集合
     */
    void decreaseStock(List<CardDTO> cardDTOList);


}
