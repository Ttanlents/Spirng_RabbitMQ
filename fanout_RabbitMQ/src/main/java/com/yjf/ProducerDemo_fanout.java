package com.yjf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 余俊锋
 * @date 2020/12/22 20:34
 * @Description ：生产者
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:springApplication.xml")
public class ProducerDemo_fanout {
    //1.注入 RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * work模式
     */
    @Test
    public void testHelloWorld(){
        //2.发送消息  到交换机【发布订阅模式/fanout】
        rabbitTemplate.convertAndSend("spring_fanout_exchange","","spring fanout....");
    }
}
