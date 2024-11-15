package com.example.design.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppConfigProperties {

    private String name;
    private Server server;
    private Datasource datasource;

    // Getters and Setters

    public static class Server {
        private int port;
        // Getters and Setters
    }

    public static class Datasource {
        private String url;
        private String username;
        private String password;
        // Getters and Setters
    }
}
