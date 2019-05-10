package com.company.designpatterns.chainofresponsibility;

public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("File: " + message);
    }
}
