package cc.ccoder.sell.order.utils;

import cc.ccoder.sell.order.pojo.ProductInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:06:43
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
