package cc.ccoder.sell.order.controller;

import cc.ccoder.sell.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/2 12:49
 */
@RestController
@RequestMapping("/env")
@RefreshScope
public class EnvController {

    @Autowired
    private GirlConfig girlConfig;

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String test(){
        return env;
    }

    @GetMapping("/girl")
    public String print(){
        return girlConfig.toString();
    }

}
