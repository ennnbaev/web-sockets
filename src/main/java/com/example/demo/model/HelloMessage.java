package com.example.demo.model;

public class HelloMessage {
    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public HelloMessage() {
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
