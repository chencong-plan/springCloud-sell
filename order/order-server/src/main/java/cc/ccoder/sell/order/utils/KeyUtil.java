package cc.ccoder.sell.order.utils;

import java.util.Random;

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
