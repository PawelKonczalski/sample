package com.nokia;

public class App {
    public static void main(String[] args) {
        String name = args[0];
        MessageUtil mu = new MessageUtil(name);
        System.out.println(mu.printMessage());
        System.out.println(mu.salutationMessage());
    }
}
