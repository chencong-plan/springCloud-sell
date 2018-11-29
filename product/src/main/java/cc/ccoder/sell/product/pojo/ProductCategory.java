package cc.ccoder.sell.product.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品类目
 *
 * @author www.ccoder.cc
 */
@Data
@Entity
public class ProductCategory {

    /**
     * 主键 自增
     */
    @Id
    @GeneratedValue
    private Integer categoryId;


    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
