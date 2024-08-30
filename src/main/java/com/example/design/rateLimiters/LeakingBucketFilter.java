package com.example.design.rateLimiters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@Component
public class LeakingBucketFilter implements Filter {

    private static final int BUCKET_CAPACITY = 10;
    private static final long LEAK_RATE = TimeUnit.SECONDS.toMillis(1); // Leak 1 token per second

    private final Map<String, LeakingBucket> clients = new ConcurrentHashMap<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code if necessary
    }



    private boolean isRateLimited(String clientIp) {
        long now = Instant.now().toEpochMilli();
        clients.computeIfAbsent(clientIp, k -> new LeakingBucket(BUCKET_CAPACITY, now));

        LeakingBucket bucket = clients.get(clientIp);
        synchronized (bucket) {
            // Calculate how much time has passed since the last request
            long timePassed = now - bucket.lastChecked;
            // Calculate how many tokens should have leaked
            long leakedTokens = timePassed / LEAK_RATE;
            // Update the bucket
            bucket.tokens = Math.min(BUCKET_CAPACITY, bucket.tokens + (int) leakedTokens);
            bucket.lastChecked = now;

            if (bucket.tokens > 0) {
                bucket.tokens--;
                return false; // Not rate limited
            }
            return true; // Rate limited
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        String clientIp = httpRequest.getRemoteAddr();
        if (isRateLimited(clientIp)) {
            httpResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            httpResponse.getWriter().write("Rate limit exceeded");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // Cleanup code if necessary
    }

    private static class LeakingBucket {
        int tokens;
        long lastChecked;

        LeakingBucket( int capacity, long now) {
            this.tokens = capacity;
            this.lastChecked = now;
        }
    }
}
