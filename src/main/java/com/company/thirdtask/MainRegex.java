package com.company.thirdtask;

import com.company.thirdtask.controller.Controller;
import com.company.thirdtask.model.Model;
import com.company.thirdtask.view.View;

/**
 * This is starting point of the program.
 *
 * @author Serhii Muzhylivskyi
 * */
public class MainRegex {

    public static void main(String[] args) {
        new Controller(new Model(), new View()).processUser();
    }
}
