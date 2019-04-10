package com.company.secondtask;

import com.company.secondtask.controller.Controller;
import com.company.secondtask.model.Model;
import com.company.secondtask.view.View;

public class MainGame {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}
