package com.company.designpatterns.singletone;

public class Singleton {

    private static int counter = 0;
    private static volatile Singleton ourInstance = null;

    public static Singleton getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }

    private Singleton() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
