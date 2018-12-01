package cc.ccoder.sell.product.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/1 18:08
 */
@Data
public class ProductInfoOutput {

    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus;

    /** 类目编号. */
    private Integer categoryType;
}
