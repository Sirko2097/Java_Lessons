package com.company.designpatterns.facade;

public class DVDRom {

    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        data = true;
    }

    public void upload() {
        data = false;
    }
}
