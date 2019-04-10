package com.company.thirdtask.view;


/**
 * This class is used to print messages and errors to console.
 *
 * @author Serhii Muzhylivskyi
 * */
public class View {

    /**
     * This method prints messages to console.<br>
     * @param message - string, which will be printed
     * */
    public void printMessage(String message) {
        System.out.print(message + " ");
    }

    /**
     * This method prints error messages to console.<br>
     * @param error - error message, will be printed.
     * */
    public void printError(String error) {
        System.err.println(error);
    }
}
