package com.company.designpatterns.memento;

import lombok.Getter;

@Getter
public class Save {

    private final String level;
    private final int ms;

    public Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }
}
