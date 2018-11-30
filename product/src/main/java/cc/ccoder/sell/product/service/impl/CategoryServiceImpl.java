package cc.ccoder.sell.product.service.impl;

import cc.ccoder.sell.product.pojo.ProductCategory;
import cc.ccoder.sell.product.repository.ProductCategoryRepository;
import cc.ccoder.sell.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author www.ccoder.cc
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public CategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
