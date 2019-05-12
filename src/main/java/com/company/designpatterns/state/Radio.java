package com.company.designpatterns.state;

import lombok.Setter;

@Setter
public class Radio {

    private Station station;

    public void nextStation() {
        if (station instanceof RadioRocks) {
            setStation(new RadioHitFM());
        } else if (station instanceof RadioHitFM) {
            setStation(new NewsFM());
        } else if (station instanceof NewsFM) {
            setStation(new RadioRocks());
        }
    }

    public void play() {
        station.play();
    }

}
