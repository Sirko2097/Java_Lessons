package com.company.designpatterns.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        VectorGraphics vectorGraphics = new VectorAdapterFromRaster();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();

        System.out.println("~~~~~~");

        VectorGraphics vectorGraphicsEx = new VectorAdapterFromRasterExt();
        vectorGraphicsEx.drawSquare();
        vectorGraphicsEx.drawLine();
    }
}
