package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)  //定義消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; //消息發送管道
    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("_________serial"+serial);
        return null;
    }
}
