package com.company.designpatterns.adapter;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
