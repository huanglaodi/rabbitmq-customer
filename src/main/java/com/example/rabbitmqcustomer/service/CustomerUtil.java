package com.example.rabbitmqcustomer.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class CustomerUtil {

    @RabbitHandler
    @RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者1收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
    public void process2(Map testMessage) {
        System.out.println("DirectReceiver消费者2收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.man")//监听的队列名称 topic.man
    public void manListener(Map testMessage) {
        System.out.println("topic.man收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.woman")//监听的队列名称 topic.woman
    public void womanListener(Map testMessage) {
        System.out.println("topic.woman收到消息  : " + testMessage.toString());
    }


    public static void main(String[] args) {
        System.out.println("你好");
    }

}
