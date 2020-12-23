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
public class ProducerDemo {
    //1.注入 RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * work模式
     */
    @Test
    public void testHelloWorld(){
        //2.发送消息
        rabbitTemplate.convertAndSend("spring_work_queue","spring work....");
    }
}
