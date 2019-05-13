package com.company.designpatterns.singletone;

public class R implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
