package com.postprocessor;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean is going through init...");
    }

    public void destory() {
        System.out.println("Bean is destorying...");
    }
}
