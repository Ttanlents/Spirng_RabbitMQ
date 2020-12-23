package com.yjf;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @author 余俊锋
 * @date 2020/12/23 12:28
 * @Description : 消费者
 */
public class SpringWorkListener_topic implements MessageListener {
    public void onMessage(Message message) {
        //打印消息
        System.out.println("work:" + new String(message.getBody()));
    }
}
