package cc.ccoder.sell.product.service.impl;

import cc.ccoder.sell.product.dto.CardDTO;
import cc.ccoder.sell.product.enums.ProductStatusEnum;
import cc.ccoder.sell.product.enums.ResultEnum;
import cc.ccoder.sell.product.exception.ProductException;
import cc.ccoder.sell.product.pojo.ProductInfo;
import cc.ccoder.sell.product.repository.ProductInfoRepository;
import cc.ccoder.sell.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<CardDTO> cardDTOList) {
        for (CardDTO cardDTO : cardDTOList) {
            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(cardDTO.getProductId());
            //商品是否存在
            if(!productInfoOptional.isPresent()){
                throw  new ProductException(ResultEnum.PRODUCT_NO_EXIST);
            }
            ProductInfo productInfo = productInfoOptional.get();
            //判断商品库存是否充足
            Integer result = productInfo.getProductStock() - cardDTO.getProductQuantity();
            if(result < 0){
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            productInfoRepository.save(productInfo);
        }
    }
}
