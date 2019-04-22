package com.company.backpacking.model;

import com.company.backpacking.dao.impl.DAOCoffeeImpl;
import com.company.backpacking.dao.impl.DAOFactoryImpl;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Main class.
 */
public class Model {

    private Connection connection;

    {
        try {
            connection = DAOFactoryImpl.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private DAOCoffeeImpl daoCoffee = DAOFactoryImpl.getInstance().getDAOCoffeeImpl(connection);

    /**
     * This method sorts list by price/weight
     *
     * @return string of sorted list
     * @throws SQLException because of work with db
     */
    public String sortCoffeeByQualityPrice() throws SQLException {
        List<Coffee> allCoffee = daoCoffee.getAllCoffee();
        Collections.sort(allCoffee);
        StringBuilder stringBuilder = getStringBuilder(allCoffee);
        return stringBuilder.toString();
    }

    private StringBuilder getStringBuilder(List<Coffee> allCoffee) {
        StringBuilder stringBuilder = new StringBuilder();

        allCoffee.forEach((n) -> stringBuilder.append(n.getName()).append(" ")
                .append(n.getCondition()).append(" ")
                .append(n.getPrice()).append("$ ")
                .append(n.getWeight()).append("kg\n"));

        return stringBuilder;
    }

    /**
     * Get element by key
     *
     * @param key - id
     * @return - element ot null
     * @throws SQLException because of work with db
     */
    public String read(String key) throws SQLException {
        Optional<Coffee> coffee = daoCoffee.read(key);
        return coffee.map(value -> value.getName() + " " +
                value.getCondition() + " " +
                value.getPrice() + "$ " +
                value.getWeight() + "kg\n").orElse(null);
    }

    /**
     * @return list of coffee
     * @throws SQLException because of work with db
     */
    public String getAllCoffee() throws SQLException {
        return getStringBuilder(daoCoffee.getAllCoffee()).toString();
    }

    /**
     * Search coffee by name
     *
     * @param name of coffee
     * @return coffee
     * @throws SQLException because of work with db
     */
    public String findByName(String name) throws SQLException {
        return getStringBuilder(daoCoffee.findByName(name)).toString();
    }

    /**
     * Search by condition
     *
     * @param condition of coffee
     * @return coffee
     * @throws SQLException because of work with db
     */
    public String findByCondition(String condition) throws SQLException {
        return getStringBuilder(daoCoffee.findByCondition(condition)).toString();
    }

    /**
     * Get all info from db
     *
     * @return list from db
     * @throws SQLException because of work with db
     */
    public String getAllInfoAboutCoffee() throws SQLException {
        List<Coffee> allInfoAboutCoffee = daoCoffee.getAllInfoAboutCoffee();

        StringBuilder stringBuilder = new StringBuilder();

        allInfoAboutCoffee.forEach((n) -> stringBuilder.append(n.getId()).append(" ")
                .append(n.getName()).append(" ")
                .append(n.getCondition()).append(" ")
                .append(n.getPrice()).append("$ ")
                .append(n.getWeight()).append("kg\n"));

        return stringBuilder.toString();
    }

    /**
     * Main task. Backpack problem.
     *
     * @param capacity of furgon
     * @return solution
     */
    public String pack(int capacity) {
        try {
            List<Coffee> allCoffee = daoCoffee.getAllCoffee();

            int[][] matrix = new int[allCoffee.size() + 1][capacity + 1];

            for (int i = 0; i <= capacity; i++) {
                matrix[0][i] = 0;
            }


            for (int i = 1; i <= allCoffee.size(); i++) {
                for (int j = 0; j <= capacity; j++) {
                    if (allCoffee.get(i - 1).getWeight() > j) {
                        matrix[i][j] = matrix[i - 1][j];
                    } else {
                        matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i - 1][j - allCoffee.get(i - 1).getWeight()]
                                + (allCoffee.get(i - 1).getPrice()));
                    }
                }
            }

            int res = matrix[allCoffee.size()][capacity];
            int w = capacity;
            List<Coffee> solution = new ArrayList<>();

            for (int i = allCoffee.size(); i > 0 && res > 0; i--) {
                if (res != matrix[i - 1][w]) {
                    solution.add(allCoffee.get(i - 1));
                    res -= allCoffee.get(i - 1).getPrice();
                    w -= allCoffee.get(i - 1).getWeight();
                }
            }

            StringBuilder stringBuilder = new StringBuilder();

            if (solution.isEmpty()) {
                stringBuilder.append("Cannot be packed");
            } else {
                stringBuilder.append("Capacity: ").append(capacity).append("\n");


                solution.forEach((n) -> stringBuilder.append(n.getId()).append(" ")
                        .append(n.getName()).append(" ")
                        .append(n.getCondition()).append(" ")
                        .append(n.getPrice()).append("$ ")
                        .append(n.getWeight()).append("kg\n"));
            }
            return stringBuilder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
