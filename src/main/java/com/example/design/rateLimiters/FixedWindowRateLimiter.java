package com.example.design.rateLimiters;

import java.util.LinkedList;
import java.util.Queue;

public class FixedWindowRateLimiter {

  private final long windowSizeInMillis; // Window size in milliseconds
  private final int capacity; // Maximum allowed requests within the window
  private final Queue<Long> timestamps; // Queue to store timestamps of allowed requests

  public FixedWindowRateLimiter(long windowSizeInMillis, int capacity) {
    this.windowSizeInMillis = windowSizeInMillis;
    this.capacity = capacity;
    this.timestamps = new LinkedList<>();
  }

  /**
   * Checks if a request can be allowed based on the current window.
   * 
   * @return true if allowed, false otherwise
   */
  public synchronized boolean allow() {
    cleanupExpiredTimestamps();

    // Check if the queue is full (exceeds capacity)
    if (timestamps.size() >= capacity) {
      return false;
    }

    // Allow the request and add the current timestamp to the queue
    timestamps.offer(System.currentTimeMillis());
    return true;
  }

  /**
   * Removes timestamps from the queue that are outside the current window.
   */
  private void cleanupExpiredTimestamps() {
    long currentTime = System.currentTimeMillis();
    while (!timestamps.isEmpty() && currentTime - timestamps.peek() > windowSizeInMillis) {
      timestamps.poll();
    }
  }
}
