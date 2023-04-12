package com.nhnacademy.edu.springframework.dooraySender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageSendService {
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@Qualifier("doorayMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void doSendMessage() {
        messageSender.sendMessage();
    }
}
