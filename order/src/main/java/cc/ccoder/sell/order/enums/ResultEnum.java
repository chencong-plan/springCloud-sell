package cc.ccoder.sell.order.enums;

import lombok.Getter;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:15:34
 */
@Getter
public enum ResultEnum {
    /**
     * 参数错误
     */
    PARAM_ERROR(1, "参数错误"),
    /**
     * 购物车为空
     */
    CART_EMPTY(2, "购物车为空");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
