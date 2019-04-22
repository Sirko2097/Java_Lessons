package com.company.backpacking.controller;

import com.company.backpacking.model.Model;
import com.company.backpacking.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * App's controller
 * @author sirko
 */
public class Controller {

    private Model model;
    private View view;

    private ResourceBundle bundle = ResourceBundle.getBundle("coffee", Locale.getDefault());
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Menu processor and connector between methods of model
     * @throws SQLException - connection to DB
     */
    public void processUser() throws  SQLException {
        setLocale();
        char key = '0';
        while (true) {
            view.printMenu(bundle);

            try {
                key = reader.readLine().charAt(0);
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (key) {
                case '0':
                    System.exit(0);
                case '1':
                    view.printMessage(bundle.getString("input.key"));
                    try {
                        view.printMessage(model.read(reader.readLine()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case '2':
                    view.printMessage(model.getAllCoffee());
                    break;
                case '3':
                    view.printMessage(bundle.getString("input.name"));
                    try {
                        view.printMessage(model.findByName(checkInfo(
                                reader.readLine(), bundle.getString("name.regexp"))));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case '4':
                    view.printMessage(bundle.getString("input.condition"));
                    try {
                        view.printMessage(model.findByCondition(checkInfo(
                                reader.readLine(), bundle.getString("name.regexp"))));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case '5':
                    view.printMessage(model.getAllInfoAboutCoffee());
                    break;
                case '6':
                    view.printMessage(model.sortCoffeeByQualityPrice());
                    break;
                case '7':
                    setLocale();
                    break;
                case '8':
                    view.printMessage(bundle.getString("input.capacity"));
                    try {

                        view.printMessage(model.pack(Integer.parseInt(reader.readLine())));
                    } catch (IOException e) {
                        view.printError(bundle.getString("input.wrong"));
                    }
                    break;
                default:
                    view.printError(bundle.getString("input.wrong"));
                    break;
            }


        }
    }

    /**
     * This method changes program`s locale.
     */
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
