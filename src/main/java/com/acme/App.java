package com.acme;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public String getGreeting2() {
        return "whatever";
    }

    public String getGreeting3() {
        return "whateve2r";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
