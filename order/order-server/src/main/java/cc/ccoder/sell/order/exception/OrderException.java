package cc.ccoder.sell.order.exception;

import cc.ccoder.sell.order.enums.ResultEnum;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:17:36
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
