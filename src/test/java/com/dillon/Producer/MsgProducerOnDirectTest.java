package com.dillon.Producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DillonXie
 * @version 1.0
 * @date 11/25/2019 7:17 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MsgProducerOnDirectTest {

    @Autowired
    private MsgProducerOnDirect producer01;

    @Test
    public void sendMsg() {
        String content = "Hi,my name is Dillon!!! I come from queue A";
        producer01.sendMsg(content);
    }

    @Test
    public void sendMsg2() {
        String content = "Hi,my name is Dillon!!! I come from queue B";
        producer01.sendMsg2(content);
    }

    @Test
    public void sendMsg3() {
        String content = "Hi,my name is Dillon!!! I come from queue C";
        producer01.sendMsg3(content);
    }

}