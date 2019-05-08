package com.company.designpatterns.facade;

public class HDD {

    public void copyFromDVD(DVDRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("Copying...");
        } else {
            System.out.println("Input disk with data.");
        }
    }
}
