package com.company.designpatterns.state;

public class StateApp {

    public static void main(String[] args) {
        Station rock = new RadioRocks();
        Radio radio = new Radio();
        radio.setStation(rock);

        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }

        System.out.println();

        Human human = new Human();
        human.setState(new Work());

        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}
