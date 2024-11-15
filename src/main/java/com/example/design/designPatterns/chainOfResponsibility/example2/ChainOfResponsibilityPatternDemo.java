package com.example.design.designPatterns.chainOfResponsibility.example2;

public class ChainOfResponsibilityPatternDemo {

    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        // Setting up the chain: INFO -> DEBUG -> ERROR
        infoLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        System.out.println("Sending INFO level message:");
        loggerChain.logMessage(Logger.INFO, "This is an informational message.");

        System.out.println("\nSending DEBUG level message:");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug-level message.");

        System.out.println("\nSending ERROR level message:");
        loggerChain.logMessage(Logger.ERROR, "This is an error-level message.");
    }
}
