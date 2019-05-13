package com.company.designpatterns.singletone;

public class SingletonApp {

    public static void main(String[] args) throws InterruptedException {
        final int size = 100;
        Thread[] t = new Thread[size];

        Singleton[] arr = new Singleton[size];
        for (int i = 0; i < size; i++) {
            t[i] = new Thread(new R());
            t[i].start();
        }
        for (int i = 0; i < size; i++) {
            t[i].join();
        }
        System.out.println(Singleton.getCounter());
    }
}
