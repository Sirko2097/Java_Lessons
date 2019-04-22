package com.company.backpacking.dao.impl;

import com.company.backpacking.dao.DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DAOFactoryImpl implements DAOFactory {

    private static DAOFactoryImpl ourInstance = new DAOFactoryImpl();

    private ResourceBundle bundle = ResourceBundle.getBundle("dao");

    public static DAOFactoryImpl getInstance() {
        return ourInstance;
    }

    private DAOFactoryImpl() {
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        String url = bundle.getString("url");

        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public DAOCoffeeImpl getDAOCoffeeImpl(Connection connection) {
        return new DAOCoffeeImpl(connection);
    }
}
