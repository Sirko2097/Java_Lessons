package com.company.backpacking;

import com.company.backpacking.controller.Controller;
import com.company.backpacking.model.Model;
import com.company.backpacking.view.View;

import java.sql.SQLException;

public class MainBackpack {

    public static void main(String[] args) throws SQLException {
        new Controller(new Model(), new View()).processUser();
    }
}
