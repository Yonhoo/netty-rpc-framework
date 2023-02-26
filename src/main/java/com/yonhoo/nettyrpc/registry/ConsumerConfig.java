package com.yonhoo.nettyrpc.registry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumerConfig {
    private String consumerInterface;
    private String timeout;
    private String invokeType;
    private String application;
    private ConsumerBootStrap consumerBootStrap;
    private ProviderInfoListener providerInfoListener;

    public ConsumerConfig(String consumerInterface, String timeout, String invokeType) {
        this.consumerInterface = consumerInterface;
        this.timeout = timeout;
        this.invokeType = invokeType;
    }

}
