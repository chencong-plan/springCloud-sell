package cc.ccoder.sell.product.vo;

import lombok.Data;

/**
 * @author www.ccoder.cc
 */
@Data
public class ResultVO<T> {


    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

}
