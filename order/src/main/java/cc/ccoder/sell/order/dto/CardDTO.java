package cc.ccoder.sell.order.dto;

import lombok.Data;

/**
 * @author 聪聪 www.ccoder.cc
 * @date 2018/11/30 23:44
 */
@Data
public class CardDTO {

    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CardDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CardDTO() {
    }
}
