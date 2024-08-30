package com.example.ratelimiter;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class SlidingWindowRateLimiter {

  private static final int MAX_REQUESTS = 5; // Max requests allowed
  private static final long TIME_WINDOW = 60000; // Time window in milliseconds (1 minute)

  private final ConcurrentMap<String, List<Long>> clientRequests = new ConcurrentHashMap<>();

  public boolean isAllowed(String clientId) {
    long now = Instant.now().toEpochMilli();
    clientRequests.putIfAbsent(clientId, Collections.synchronizedList(new LinkedList<>()));

    List<Long> requests = clientRequests.get(clientId);
    synchronized (requests) {
      // Remove outdated requests
      requests.removeIf(timestamp -> timestamp <= now - TIME_WINDOW);

      if (requests.size() < MAX_REQUESTS) {
        requests.add(now);
        return true;
      } else {
        return false;
      }
    }
  }
}
