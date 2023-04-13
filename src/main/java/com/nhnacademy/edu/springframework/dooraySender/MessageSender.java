package com.nhnacademy.edu.springframework.dooraySender;

public interface MessageSender {
    public boolean sendMessage(User user, String message);
}
