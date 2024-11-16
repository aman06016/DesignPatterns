package com.example.design.LowLevelDesign.DesignKafka;

public class Consumer {
    private final Broker broker;
    private final String topicName;
    private int partitionId;

    public Consumer(Broker broker, String topicName, int partitionId) {
        this.broker = broker;
        this.topicName = topicName;
        this.partitionId = partitionId;
    }

    public void consumeMessages() {
        Topic topic = broker.getTopic(topicName);
        if (topic == null) {
            throw new IllegalArgumentException("Topic not found: " + topicName);
        }

        Partition partition = topic.getPartition(partitionId);
        while (!partition.isEmpty()) {
            Message message = partition.consumeMessage();
            System.out.println("Consumed message from topic: " + topicName + ", partition: " + partitionId +
                               ", key: " + message.getKey() + ", value: " + message.getValue());
        }
    }
}
