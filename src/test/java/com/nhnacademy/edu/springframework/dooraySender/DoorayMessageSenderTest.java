package com.nhnacademy.edu.springframework.dooraySender;

import com.nhn.dooray.client.DoorayHookSender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class DoorayMessageSenderTest {

    @Test
    public void testDoorayMessageSender() {
        DoorayHookSender doorayHookSender = mock(DoorayHookSender.class);
        User user = mock(User.class);
        DoorayMessageSender messageSender = new DoorayMessageSender(doorayHookSender);

        boolean ret = messageSender.sendMessage(user, "test");

        Assertions.assertThat(ret).isTrue();
    }

}