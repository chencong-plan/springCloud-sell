package cc.ccoder.sell.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供测试服务  给order调用
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 15:23:05
 */
@RestController
public class ServerController {


    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg" + System.currentTimeMillis();
    }
}
