package cc.ccoder.sell.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接受rabbitMQ消息
 *
 * @author 聪聪 www.ccoder.cc
 * @date 2018/12/2 20:08
 */
@Slf4j
@Component
public class MqReceiver {
//    手动创建队列，并绑定@RabbitListener(queues = "myQueue")
//    自动创建队列    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
//    自动创建 Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message) {
        log.info("接受到rabbitMQ消息:{}", message);
    }


    /**
     * 数码供应商服务 接受消息
     * @param message 接受消息
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myOrder"),
            key = "computer",
            exchange = @Exchange("computerOrder")
    ))
    public void processComputer(String message) {
        log.info("Computer,接受到rabbitMQ消息:{}", message);
    }


    /**
     * 水果供应商服务 接受消息
     * @param message 接受消息
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myOrder"),
            key = "fruit",
            exchange = @Exchange("fruitOrder")
    ))
    public void processFruit(String message) {
        log.info("fruit,接受到rabbitMQ消息:{}", message);
    }

}
