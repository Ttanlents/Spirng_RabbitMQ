package com.yjf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 余俊锋
 * @date 2020/12/22 20:34
 * @Description ：生产者
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:springApplication.xml")
public class ProducerDemo_header {
    //1.注入 RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    /**
     * work模式
     */
    @Test
    public void testHelloWorld(){
        //2.发送消息
        // 准备header参数
        Map<String, Object> headers = new HashMap<>();
//        headers.put("key1", "147");
        headers.put("key2", "258");
//        headers.put("key3", "369");

        // 使用的是rabbitMessagingTemplate 而不是 rabbitTemplate
        rabbitMessagingTemplate.convertAndSend("spring_header_exchange", "", "boot header....", headers);
    }
}
