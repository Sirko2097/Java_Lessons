package com.company.backpacking.dao;

import com.company.backpacking.model.Coffee;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAOCoffee {
    Optional<Coffee> read(String key) throws SQLException;

    List<Coffee> getAllCoffee() throws SQLException;

    List<Coffee> findByName(String name) throws SQLException;

    List<Coffee> findByCondition(String condition) throws SQLException;

    List<Coffee> getAllInfoAboutCoffee() throws SQLException;
}
