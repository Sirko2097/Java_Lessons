package com.company.backpacking.dao.impl;

import com.company.backpacking.dao.DAOCoffee;
import com.company.backpacking.model.Coffee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * DAO for coffee object.
 *
 * @author sirko
 */
public class DAOCoffeeImpl implements DAOCoffee {

    private Connection connection;
    private ResourceBundle bundle = ResourceBundle.getBundle("dao");

    DAOCoffeeImpl(Connection connection) {
        this.connection = connection;
    }

    /**
     * This method get coffee by individual key
     *
     * @param key individual key in DB
     * @return Coffee, if it exists in DB
     * @throws SQLException because of working with DB
     */
    @Override
    public Optional<Coffee> read(String key) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("FIND_BY_KEY"));
        preparedStatement.setInt(1, Integer.parseInt(key));
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Coffee coffee = new Coffee();
            coffee.setName(resultSet.getString(1));
            coffee.setCondition(resultSet.getString(2));
            coffee.setWeight(resultSet.getInt(3));
            coffee.setPrice(resultSet.getInt(4));
            return Optional.of(coffee);
        }

        return Optional.empty();
    }

    /**
     * Print all coffee from db
     *
     * @return List of coffee
     * @throws SQLException because of working with DB
     */
    @Override
    public List<Coffee> getAllCoffee() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("PRINT_ALL_COFFEE"));
        return getCoffees(preparedStatement);
    }

    /**
     * This method searches for coffees in db
     *
     * @param name - name of coffee brand
     * @return list of coffee
     * @throws SQLException because of working with DB
     */
    @Override
    public List<Coffee> findByName(String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("FIND_BY_NAME"));
        preparedStatement.setString(1, name);
        return getCoffees(preparedStatement);
    }

    /**
     * This method is helper for searchers.
     *
     * @param preparedStatement - request to DB
     * @return list of coffee
     * @throws SQLException because of working with DB
     */
    private List<Coffee> getCoffees(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Coffee> coffees = new ArrayList<>();
        Coffee coffee;
        while (resultSet.next()) {
            coffee = new Coffee(resultSet.getString(1), resultSet.getString(2),
                    resultSet.getInt(3), resultSet.getInt(4));

            coffees.add(coffee);
        }
        return coffees;
    }

    /**
     * This method for coffees by their condition.
     *
     * @param condition of coffee
     * @return list of coffee
     * @throws SQLException because of working with DB
     */
    @Override
    public List<Coffee> findByCondition(String condition) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("FIND_BY_CONDITION"));
        preparedStatement.setString(1, condition);
        return getCoffees(preparedStatement);
    }

    /**
     * This method return all info from db about coffee. For admin(in future)
     *
     * @return list of coffee.
     * @throws SQLException because of working with DB
     */
    @Override
    public List<Coffee> getAllInfoAboutCoffee() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(bundle.getString("GET_ALL_INFO_ABOUT_COFFEE"));
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Coffee> coffees = new ArrayList<>();
        Coffee coffee;
        while (resultSet.next()) {
            coffee = new Coffee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                    resultSet.getInt(4), resultSet.getInt(5));

            coffees.add(coffee);
        }
        return coffees;
    }
}
