package com.example.tutorial.model;

public class HelloWorldModel {
    private String message;

    public HelloWorldModel(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldModel{ " +
                "message='" + message + '\'' +
                '}';
    }
}
