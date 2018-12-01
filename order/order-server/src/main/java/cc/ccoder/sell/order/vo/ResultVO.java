package cc.ccoder.sell.order.vo;

import lombok.Data;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:09:48
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
