package com.nhnacademy.edu.springframework.dooraySender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.dooraySender")){
            User user = new User();
            user.setName("...");
            String message = ".....";
            MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
            service.doSendMessage(user, message);
        }

    }
}