package com.yonhoo.nettyrpc.example;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String message) {
        return "yonhoo " + message;
    }
}
