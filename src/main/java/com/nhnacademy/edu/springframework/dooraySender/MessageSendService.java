package com.nhnacademy.edu.springframework.dooraySender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSendService {
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
