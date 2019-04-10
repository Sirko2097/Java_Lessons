package com.company.thirdtask.controller;

import com.company.thirdtask.model.Model;
import com.company.thirdtask.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class is used to control all process in program<br>
 * After checking all values, which user typed send data to model and result to view.
 *
 * @see Model
 * @see View
 *
 * @author Serhii Muzhylivskyi
 * */
public class Controller {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Model model;
    private View view;

    private ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.getDefault());

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method is used to interact with user through view
     * and send his data to checker.
     * */
    public void processUser() {
        setLocale();

        model.setFirsName(checkInfo(bundle.getString("input.first.name"),
                bundle.getString("first.name.regexp")));
        model.setLastName(checkInfo(bundle.getString("input.last.name"),
                bundle.getString("last.name.regexp")));
        model.setPhoneNumber(checkInfo(bundle.getString("input.phone"),
                bundle.getString("phone.regexp")));

        view.printMessage(model.toString());
    }


    /**
     * This method changes program`s locale.
     * */
    private void setLocale() {
        view.printMessage(bundle.getString("input.set.locale"));

        try {
            String locale = reader.readLine();
            if (locale.equalsIgnoreCase("uk")) {
                this.bundle = ResourceBundle.getBundle("message", new Locale("uk", "UA"));
            } else {
                this.bundle = ResourceBundle.getBundle("message");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method checks user's data.<br>
     *
     * @param str - message, which will be printed. It shows what exactly user need to input.
     * @param regexp - regexp for checking user data.
     * @return user data, if everything is correct
     * */
    private String checkInfo(String str, String regexp) {
        String value;
        while (true) {
            try {
                view.printMessage(str);
                value = reader.readLine().trim();
                if (value.matches(regexp)) {
                    return value;
                } else {
                    view.printError(bundle.getString("input.wrong"));
                }
            } catch (IOException e) {
                view.printError(bundle.getString("input.wrong"));
            }
        }
    }
}
