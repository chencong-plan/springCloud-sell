package cc.ccoder.sell.order.message;

import cc.ccoder.sell.order.OrderApplication;
import cc.ccoder.sell.order.OrderApplicationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

/**
 * 发送mq消息测试
 *
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/2 20:09
 */
public class MqReceiverTest extends OrderApplicationTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "发送消息测试");
    }

    @Test
    public void sendMessage() {
        amqpTemplate.convertAndSend("computerOrder","computer", "发送消息测试");
    }
}