package com.company.backpacking.controller;

import com.company.backpacking.model.Model;
import com.company.backpacking.view.View;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {

    private Model model;
    private View view;

    private ResourceBundle bundle = ResourceBundle.getBundle("coffee", Locale.getDefault());

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        setLocale();

    }

    private void setLocale() {
        view.printMessage(bundle.getString("input.set.locale"));

        try {
            String locale = reader.readLine();
            if (locale.equalsIgnoreCase("uk")) {
                this.bundle = ResourceBundle.getBundle("coffee", new Locale("uk", "UA"));
            } else {
                this.bundle = ResourceBundle.getBundle("coffee");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
