package com.company.backpacking.dao.impl;

import com.company.backpacking.dao.DAOCoffee;
import com.company.backpacking.model.Coffee;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

@NoArgsConstructor
public class DAOCoffeeImpl implements DAOCoffee {

    private Connection connection;
    private ResourceBundle bundle = ResourceBundle.getBundle("dao");

    public DAOCoffeeImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public Optional<Coffee> read(String key) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("FIND_BY_KEY"));
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Coffee coffee = new Coffee();
            coffee.setName(resultSet.getString(1));
            coffee.setCondition(resultSet.getString(2));
            coffee.setWeight(resultSet.getInt(3));
            coffee.setPrice(resultSet.getDouble(4));
            return Optional.of(coffee);
        }

        return Optional.empty();
    }

    @Override
    public List<Coffee> getAllCoffee() {
        return null;
    }

    @Override
    public List<Coffee> findByName() {
        return null;
    }

    @Override
    public List<Coffee> findByCondition() {
        return null;
    }
}
