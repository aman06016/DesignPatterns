package com.example.design.designPatterns.chainOfResponsibility.example2;

abstract class Logger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected Logger nextLogger;

    // Set the next logger in the chain
    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // Process the message or pass it along the chain
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
