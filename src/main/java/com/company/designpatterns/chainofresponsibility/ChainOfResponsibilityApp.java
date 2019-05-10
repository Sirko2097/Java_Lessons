package com.company.designpatterns.chainofresponsibility;

public class ChainOfResponsibilityApp {

    public static void main(String[] args) {
        Logger logger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);
        logger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        logger.writeMessage("Info", Level.INFO);
        logger.writeMessage("Debug", Level.DEBUG);
        logger.writeMessage("Error", Level.ERROR);
    }
}
