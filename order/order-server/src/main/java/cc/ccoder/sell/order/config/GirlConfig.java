package cc.ccoder.sell.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 使用RefreshScope和ConfigurationProperties配置进行要刷新的范围
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/2 14:25
 */
@Data
@Component
@ConfigurationProperties("girl")
@RefreshScope
public class GirlConfig {

    private String name;
    private Integer age;
}
