package com.nokia;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        return message;
    }

    public String salutationMessage() {
        message = "Hi! " + message;
        return message;
    }

}
