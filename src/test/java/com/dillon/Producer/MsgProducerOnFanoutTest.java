package com.dillon.Producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DillonXie
 * @version 1.0
 * @date 11/25/2019 8:06 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MsgProducerOnFanoutTest {
    @Autowired
    private MsgProducerOnFanout msgProducerOnFanout;

    @Test
    public void sendMsg() {
        String content = "Hi,my name is Dillon!!!";
        msgProducerOnFanout.sendMsg(content);
    }
}
