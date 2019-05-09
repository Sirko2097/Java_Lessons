package com.company.designpatterns.adapter;

public class VectorAdapterFromRasterExt implements VectorGraphics {

    private RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
