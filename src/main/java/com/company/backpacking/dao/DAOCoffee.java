package com.company.backpacking.dao;

import com.company.backpacking.model.Coffee;

import java.util.List;

public interface DAOCoffee {
    Coffee read(String key);

    List<Coffee> getAllCoffoee();
}
