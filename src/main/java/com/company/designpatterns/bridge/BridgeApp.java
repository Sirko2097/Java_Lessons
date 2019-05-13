package com.company.designpatterns.bridge;

public class BridgeApp {

    public static void main(String[] args) {
        CarBase carBase = new Coupe(new Mercedes());
        carBase.showDetails();
    }
}
