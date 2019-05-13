package com.company.designpatterns.singletone;

public class SingletonApp {

    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 100;
        Thread[] t = new Thread[SIZE];

        Singleton[] arr = new Singleton[SIZE];
        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println(Singleton.getCounter());
    }
}
