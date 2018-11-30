package cc.ccoder.sell.product.service.impl;

import cc.ccoder.sell.product.enums.ProductStatusEnum;
import cc.ccoder.sell.product.pojo.ProductInfo;
import cc.ccoder.sell.product.repository.ProductInfoRepository;
import cc.ccoder.sell.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author www.ccoder.cc
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductInfoRepository productInfoRepository;

    @Autowired
    public ProductServiceImpl(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
