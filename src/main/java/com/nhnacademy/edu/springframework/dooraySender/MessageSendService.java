package com.nhnacademy.edu.springframework.dooraySender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
