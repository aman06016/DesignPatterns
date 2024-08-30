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
public class TokenBucketFilter implements Filter {

    private static final int MAX_REQUESTS = 5;
    private static final long TIME_WINDOW = TimeUnit.MINUTES.toMillis(1);

    private final Map<String, RequestBucket> clients = new ConcurrentHashMap<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code if necessary
    }


    private boolean isRateLimited(String clientIp) {
        long now = Instant.now().toEpochMilli();
        clients.computeIfAbsent(clientIp, k -> new RequestBucket(now, 0));

        RequestBucket bucket = clients.get(clientIp);
        synchronized (bucket) {
            if (now - bucket.timestamp > TIME_WINDOW) {
                bucket.timestamp = now;
                bucket.requestCount = 0;
            }
            if (bucket.requestCount >= MAX_REQUESTS) {
                return true;
            }
            bucket.requestCount++;
            return false;
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String clientIp = httpRequest.getRemoteAddr();
        if (isRateLimited(clientIp)) {
            httpResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            httpResponse.getWriter().write("Rate limit exceeded");
            return;
        }

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Cleanup code if necessary
    }

    private static class RequestBucket {
        long timestamp;
        int requestCount;

        RequestBucket(long timestamp, int requestCount) {
            this.timestamp = timestamp;
            this.requestCount = requestCount;
        }
    }
}
