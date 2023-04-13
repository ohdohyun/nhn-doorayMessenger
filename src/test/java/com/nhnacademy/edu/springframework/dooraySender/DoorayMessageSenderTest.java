package com.nhnacademy.edu.springframework.dooraySender;

import com.nhn.dooray.client.DoorayHookSender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DoorayMessageSenderTest {

    @Test
    public void testDoorayMessageSender() {
        DoorayHookSender doorayHookSender = Mockito.mock(DoorayHookSender.class);
        User user = Mockito.mock(User.class);
        DoorayMessageSender messageSender = new DoorayMessageSender(doorayHookSender);

        boolean ret = messageSender.sendMessage(user, "");
        Assertions.assertThat(ret).isTrue();
    }

}