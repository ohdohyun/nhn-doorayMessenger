package com.nhnacademy.edu.springframework.dooraySender;

import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.dooraySender")
@EnableAspectJAutoProxy
public class MessageSenderConfig {

    String doorayHookUrl = "https://hook.dooray.com/services/3204376758577275363/3514081992077299709/HOTTporbR6CBAVodltB-Dw";

    @Bean
    public DoorayHookSender doorayHookSender() {
        return new DoorayHookSender(new RestTemplate(), doorayHookUrl);
    }
}
