package com.company.designpatterns.delegate;

public class DelegateApp {

    public static void main(String[] args) {
        Artist artist = new Artist();
        artist.setGraphics(new Square());
        artist.draw();

        artist.setGraphics(new Triangle());
        artist.draw();
    }

}
