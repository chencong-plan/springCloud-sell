package cc.ccoder.sell.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author www.ccoder.cc
 */
@EnableFeignClients(basePackages = "cc.ccoder.sell.product.client")
@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan(basePackages = "cc.ccoder")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
