package com.example.design.LowLevelDesign.DesignKafka;

import java.util.HashMap;
import java.util.Map;

public class Broker {
    private final int brokerId;
    private final Map<String, Topic> topics = new HashMap<>();

    public Broker(int brokerId) {
        this.brokerId = brokerId;
    }

    public void createTopic(String topicName, int partitionCount) {
        topics.put(topicName, new Topic(topicName, partitionCount));
    }

    public Topic getTopic(String topicName) {
        return topics.get(topicName);
    }

    public int getBrokerId() {
        return brokerId;
    }
}
