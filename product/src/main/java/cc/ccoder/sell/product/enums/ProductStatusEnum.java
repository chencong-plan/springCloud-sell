package cc.ccoder.sell.product.enums;

import lombok.Getter;

/**
 * @author www.ccoder.cc
 */
@Getter
public enum ProductStatusEnum {


    /**
     * 上架
     */
    UP(0, "上架"),
    /**
     * 下架
     */
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
