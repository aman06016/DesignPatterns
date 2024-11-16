package com.example.design.LowLevelDesign.DesignKafka;

public class Message {
    private final String key;
    private final String value;

    public Message(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
