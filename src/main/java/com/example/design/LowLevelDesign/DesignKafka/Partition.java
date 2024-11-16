package com.example.design.LowLevelDesign.DesignKafka;

import java.util.LinkedList;
import java.util.Queue;

public class Partition {
    private final int partitionId;
    private final Queue<Message> messages = new LinkedList<>();

    public Partition(int partitionId) {
        this.partitionId = partitionId;
    }

    public int getPartitionId() {
        return partitionId;
    }

    public void addMessage(Message message) {
        messages.offer(message);
    }

    public Message consumeMessage() {
        return messages.poll();
    }

    public boolean isEmpty() {
        return messages.isEmpty();
    }
}
