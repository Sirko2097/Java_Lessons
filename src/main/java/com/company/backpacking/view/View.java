package com.company.backpacking.view;

import java.util.ResourceBundle;

/**
 * This class is used to print messages and errors to console.
 *
 * @author Serhii Muzhylivskyi
 */
public class View {

    /**
     * This method prints messages to console.<br>
     *
     * @param message - string, which will be printed
     */
    public void printMessage(String message) {
        System.out.print(message + " ");
    }

    /**
     * This method prints error messages to console.<br>
     *
     * @param error - error message, will be printed.
     */
    public void printError(String error) {
        System.err.println(error);
    }

    public void printMenu(ResourceBundle bundle) {
        System.out.println('\n');
        System.out.println(bundle.getString("menu1"));
        System.out.println(bundle.getString("menu2"));
        System.out.println(bundle.getString("menu3"));
        System.out.println(bundle.getString("menu4"));
        System.out.println(bundle.getString("menu5"));
        System.out.println(bundle.getString("menu6"));
        System.out.println(bundle.getString("menu7"));
        System.out.println(bundle.getString("menu8"));
        System.out.println(bundle.getString("menu0"));
        System.out.print(bundle.getString("user_variant") + " ");

    }
}