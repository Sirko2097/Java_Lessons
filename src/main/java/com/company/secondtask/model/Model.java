package com.company.secondtask.model;

import com.company.secondtask.view.View;

import java.util.ArrayList;

public class Model {

    private int inf = 0;
    private int sup = 100;
    private View view = new View();
    private int secretNumber;

    private ArrayList<Integer> guesses = new ArrayList<>();

    public Model() {
        this.secretNumber = (int) Math.ceil(Math.random() * (sup - inf - 1) + inf);
    }


    public boolean checkValue(int value) {
        guesses.add(value);

        if (value == secretNumber) {
            return true;
        } else if (value > secretNumber) {
            view.printMessage("Lower");
            sup = value;
        } else {
            view.printMessage("Greater");
            inf = value;
        }

        return false;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getInf() {
        return inf;
    }

    public int getSup() {
        return sup;
    }
}
