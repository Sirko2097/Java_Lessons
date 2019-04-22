package com.company.backpacking.dao;

import com.company.backpacking.dao.impl.DAOCoffeeImpl;

import java.sql.Connection;
import java.sql.SQLException;

public interface DAOFactory {

    Connection getConnection() throws SQLException;

    DAOCoffeeImpl getDAOCoffeeImpl(Connection connection);
}
