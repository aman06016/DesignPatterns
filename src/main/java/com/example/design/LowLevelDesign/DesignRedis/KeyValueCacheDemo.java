package com.example.design.LowLevelDesign.DesignRedis;

public class KeyValueCacheDemo {
    public static void main(String[] args) throws InterruptedException {
        KeyValueCache<String, String> cache = new KeyValueCache<>(3);

        // Setting values with TTL (in seconds)
        cache.set("key1", "value1", 5); // Expires in 5 seconds
        cache.set("key2", "value2", 10); // Expires in 10 seconds
        cache.set("key3", "value3", 0); // No expiration

        // Accessing values
        System.out.println("key1: " + cache.get("key1")); // value1
        System.out.println("key2: " + cache.get("key2")); // value2
        System.out.println("key3: " + cache.get("key3")); // value3

        // Adding more keys to trigger LRU eviction
        cache.set("key4", "value4", 0); // This should evict the least recently used key (key1)

        // Verifying eviction
        System.out.println("key1 (evicted): " + cache.get("key1")); // Should be null
        System.out.println("key4: " + cache.get("key4")); // value4

        // Checking TTL expiration
        Thread.sleep(5000); // Wait for 5 seconds
        System.out.println("key2 (expired): " + cache.get("key2")); // Should be null if TTL expired
    }
}
