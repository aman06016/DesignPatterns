package com.example.design.LowLevelDesign.DesignRedis;

import java.util.*;

public class KeyValueCache<K, V> {
    private final int capacity;
    private final Map<K, CacheEntry<V>> cacheMap;
    private final LinkedHashMap<K, Long> accessOrder;

    public KeyValueCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.accessOrder = new LinkedHashMap<>(capacity, 0.75f, true); // Enable access-order iteration
    }

    public synchronized void set(K key, V value, long ttlInSeconds) {
        if (cacheMap.size() >= capacity) {
            evict();
        }
        
        CacheEntry<V> entry = new CacheEntry<>(value, ttlInSeconds);
        cacheMap.put(key, entry);
        accessOrder.put(key, System.currentTimeMillis());
    }

    public synchronized V get(K key) {
        CacheEntry<V> entry = cacheMap.get(key);

        if (entry == null || entry.isExpired()) {
            cacheMap.remove(key);
            accessOrder.remove(key);
            return null;
        }

        // Update access order for LRU
        accessOrder.put(key, System.currentTimeMillis());
        return entry.getValue();
    }

    public synchronized void delete(K key) {
        cacheMap.remove(key);
        accessOrder.remove(key);
    }

    private void evict() {
        Iterator<Map.Entry<K, Long>> iterator = accessOrder.entrySet().iterator();
        if (iterator.hasNext()) {
            K lruKey = iterator.next().getKey();
            iterator.remove();
            cacheMap.remove(lruKey);
            System.out.println("Evicted key: " + lruKey);
        }
    }

    public synchronized int size() {
        return cacheMap.size();
    }
}
