package cc.ccoder.sell.order.enums;

import lombok.Getter;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 11:48:02
 */
@Getter
public enum OrderStatusEnum {

    /**
     * 新订单
     */
    NEW(0, "新订单"),
    /**
     * 完结
     */
    FINISHED(1, "完结"),
    /**
     * 取消
     */
    CANCEL(2, "取消"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
