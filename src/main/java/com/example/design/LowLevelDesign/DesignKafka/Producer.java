package com.example.design.LowLevelDesign.DesignKafka;

import java.util.Random;

public class Producer {
    private final Broker broker;
    private final Random random = new Random();

    public Producer(Broker broker) {
        this.broker = broker;
    }

    public void sendMessage(String topicName, Message message) {
        Topic topic = broker.getTopic(topicName);
        if (topic == null) {
            throw new IllegalArgumentException("Topic not found: " + topicName);
        }
        // Randomly choose a partition
        int partitionId = random.nextInt(topic.getPartitions().size());
        Partition partition = topic.getPartition(partitionId);
        partition.addMessage(message);
        System.out.println("Produced message to topic: " + topicName + ", partition: " + partitionId);
    }
}
