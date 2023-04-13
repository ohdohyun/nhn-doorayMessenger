package com.nhnacademy.edu.springframework.dooraySender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.dooraySender");
//
//        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
//        messageSendService.doSendMessage();

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){

            User user = new User();
            user.setName("lastTest");
            String message = "testMessage";
            MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
            service.doSendMessage(user, message);
        }

    }
}