package com.company.designpatterns.chainofresponsibility;

public abstract class Logger {

    protected int priority;
    protected Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public Logger(int priority) {
        this.priority = priority;
    }

    void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    protected abstract void write(String message);

}
