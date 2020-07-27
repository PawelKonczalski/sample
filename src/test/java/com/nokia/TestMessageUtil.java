package com.nokia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

    String message = "Interns";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        message = "Hi! " + message;
        assertEquals(message, messageUtil.salutationMessage());
    }
}
