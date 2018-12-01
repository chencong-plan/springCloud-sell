package cc.ccoder.sell.product.service;

import cc.ccoder.sell.product.ProductApplicationTests;
import cc.ccoder.sell.product.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;
    @Test
    public void findList() {
        List<ProductInfo> list = productService.findList(Arrays.asList("157875196366160022","157875227953464068"));
        Assert.assertTrue(list.size() > 0);

    }
}