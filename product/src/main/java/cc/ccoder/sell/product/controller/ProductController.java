package cc.ccoder.sell.product.controller;

import cc.ccoder.sell.product.dto.CardDTO;
import cc.ccoder.sell.product.pojo.ProductCategory;
import cc.ccoder.sell.product.pojo.ProductInfo;
import cc.ccoder.sell.product.service.CategoryService;
import cc.ccoder.sell.product.service.ProductService;
import cc.ccoder.sell.product.utils.ResultVOUtil;
import cc.ccoder.sell.product.vo.ProductInfoVO;
import cc.ccoder.sell.product.vo.ProductVO;
import cc.ccoder.sell.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author www.ccoder.cc
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    private final CategoryService categoryService;

    @Autowired
    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public ResultVO list() {
        //1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        //3. 从数据库查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        
        //4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

    /**
     * 获取商品列表(给订单服务调用)
     *
     * @param productIdList 商品主键集合
     * @return 返回列表集合
     */
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList) {
        return productService.findList(productIdList);
    }


    /**
     * 扣库存操作
     * @param cardDTOList
     */
    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CardDTO> cardDTOList) {
        productService.decreaseStock(cardDTOList);
    }
}
