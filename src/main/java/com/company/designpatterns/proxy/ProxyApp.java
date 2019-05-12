package com.company.designpatterns.proxy;

public class ProxyApp {

    public static void main(String[] args) {
        Image image = new ProxyImage("/home/sirko/pictures/pic1.jpg");
        image.display();
    }
}
