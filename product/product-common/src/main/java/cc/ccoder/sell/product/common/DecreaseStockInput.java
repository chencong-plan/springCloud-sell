package cc.ccoder.sell.product.common;

import lombok.Data;

/**
 * 减库存入参
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/1 18:09
 */
@Data
public class DecreaseStockInput {

    private String productId;
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
