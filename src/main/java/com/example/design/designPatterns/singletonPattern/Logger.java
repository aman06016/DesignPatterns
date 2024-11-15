package com.example.design.designPatterns.singletonPattern;

public class Logger {

  private static Logger instance; // Single instance variable
  private static final Object lock = new Object(); // For thread safety

  private Logger() {
    // Private constructor to prevent external instantiation
  }

  public static Logger getInstance() {
    if (instance == null) {
      synchronized (lock) { // Thread-safe instance creation
        if (instance == null) {
          instance = new Logger();
        }
      }
    }
    return instance;
  }

  // Public methods to use the logger functionality
  public void log(String message) {
    System.out.println("Log: " + message);
  }
}

// Usage Example

