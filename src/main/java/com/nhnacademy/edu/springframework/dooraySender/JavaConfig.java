package com.nhnacademy.edu.springframework.dooraySender;

import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public MessageSendService messageSendService(MessageSender messageSender) {
        return new MessageSendService(messageSender);
    }

    @Bean
    public MessageSender messageSender(DoorayHookSender doorayHookSender) {
        return new DoorayMessageSender(doorayHookSender);
    }

    @Bean
    public DoorayHookSender doorayHookSender() {
        String url = "https://hook.dooray.com/services/3204376758577275363/3514081992077299709/HOTTporbR6CBAVodltB-Dw";
        return new DoorayHookSender(new RestTemplate(), url);
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }



}
