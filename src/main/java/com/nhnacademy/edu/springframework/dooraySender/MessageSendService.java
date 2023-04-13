package com.nhnacademy.edu.springframework.dooraySender;


public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
