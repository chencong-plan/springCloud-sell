package cc.ccoder.sell.order.enums;

import lombok.Getter;

/**
 * 订单支付状态
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 11:48:09
 */
@Getter
public enum PayStatusEnum {


    /**
     * 等待支付
     */
    WAIT(0, "等待支付"),
    /**
     * 支付成功
     */
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
