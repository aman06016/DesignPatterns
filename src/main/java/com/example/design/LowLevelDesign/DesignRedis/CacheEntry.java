package com.example.design.LowLevelDesign.DesignRedis;

import java.time.Instant;

public class CacheEntry<V> {
    private final V value;
    private final long expiryTime;

    public CacheEntry(V value, long ttlInSeconds) {
        this.value = value;
        this.expiryTime = ttlInSeconds > 0 ? Instant.now().getEpochSecond() + ttlInSeconds : -1;
    }

    public V getValue() {
        return value;
    }

    public boolean isExpired() {
        return expiryTime != -1 && Instant.now().getEpochSecond() > expiryTime;
    }
}
