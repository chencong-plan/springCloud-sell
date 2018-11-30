package cc.ccoder.sell.order.controller;

import cc.ccoder.sell.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试客户端调用服务
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 15:17:56
 */
@RestController
@Slf4j
public class ClientController {


    /**
     * ① 使用RestTemplate ，url为写死地址
     * ② 利用loadBalancerClient，通过应用名获取url，然后使用RestTemplate
     * ③ 利用@LoadBalanced注解，可在restTemplate中直接使用应用名
     */

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("/getProductMsg")
//    public String getProductMsg() {
//        1.第一种方式(直接使用restTemplate, url写死)
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8081/msg", String.class);

//        2. 第二种方式(利用loadBalancerClient通过应用名获取url, 然后再使用restTemplate)
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/msg";
//        String response = restTemplate.getForObject(url, String.class);

//        3. 第三种方式(利用@LoadBalanced, 可在restTemplate里使用应用名字)
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
//
//        log.info("response={}", response);
//        return response;
//    }

    @Autowired
    private ProductClient productClient;


    @GetMapping("/getProductMsg")
    public String getProductMsg() {

        String response = productClient.productMsg();
        log.info("response={}", response);
        return response;
    }

}
