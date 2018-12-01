package cc.ccoder.sell.product.exception;

import cc.ccoder.sell.product.enums.ResultEnum;

/**
 * @author 聪聪 www.ccoder.cc
 * @date 2018/11/30 23:48
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }




}
