package cc.ccoder.sell.product.enums;

import lombok.Getter;

/**
 * @author 聪聪 www.ccoder.cc
 * @date 2018/11/30 23:49
 */

@Getter
public enum ResultEnum {

    /**
     * 商品不存在
     */
    PRODUCT_NO_EXIST(1, "商品不存在"),

    /**
     * 库存有误
     */
    PRODUCT_STOCK_ERROR(2,"库存有误"),
    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
