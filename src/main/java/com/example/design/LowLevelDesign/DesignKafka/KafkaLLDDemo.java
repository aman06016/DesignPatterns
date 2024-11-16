package com.example.design.LowLevelDesign.DesignKafka;

public class KafkaLLDDemo {
    public static void main(String[] args) {
        // Initialize broker
        Broker broker = new Broker(1);
        
        // Create topic with partitions
        broker.createTopic("orders", 3);

        // Initialize producer
        Producer producer = new Producer(broker);
        
        // Produce messages to the topic
        producer.sendMessage("orders", new Message("order1", "Buy item A"));
        producer.sendMessage("orders", new Message("order2", "Buy item B"));
        producer.sendMessage("orders", new Message("order3", "Buy item C"));

        // Initialize consumer for a specific partition
        Consumer consumer1 = new Consumer(broker, "orders", 0);
        Consumer consumer2 = new Consumer(broker, "orders", 1);
        Consumer consumer3 = new Consumer(broker, "orders", 2);

        // Consume messages
        consumer1.consumeMessages();
        consumer2.consumeMessages();
        consumer3.consumeMessages();
    }
}
