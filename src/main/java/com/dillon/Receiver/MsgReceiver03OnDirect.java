package com.dillon.Receiver;

import com.dillon.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author DillonXie
 * @version 1.0
 * @date 11/25/2019 7:28 PM
 */
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_C)
public class MsgReceiver03OnDirect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("处理器three接收处理队列C当中的消息： " + content);
    }
}