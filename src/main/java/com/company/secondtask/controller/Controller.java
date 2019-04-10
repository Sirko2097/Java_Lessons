package com.company.secondtask.controller;

import com.company.secondtask.model.Model;
import com.company.secondtask.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

        while (!model.checkValue(getUserValue())) {
            view.printMessage("Try again.");
        }

        view.printMessage("Congrats! Answer: " + model.getSecretNumber());
        view.printMessage("Your way of thoughts: " + model.getGuesses().toString());

    }

    private int getUserValue() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value;

        while (true) {
            view.printElementOfInputMenu("Input number (0,100): ");
            try {
                value = Integer.parseInt(reader.readLine());

                if ((value >= model.getSup()) || (value <= model.getInf())) {
                    view.printError("Wrong number! It's not in range (0, 100)");
                } else {
                    return value;
                }
            } catch (IOException | NumberFormatException e) {
                view.printError("Wrong input! Try again");
            }
        }
    }
}
