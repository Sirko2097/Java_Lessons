package com.company.backpacking.dao;

import java.sql.Connection;

public interface DAOFactory {

    Connection getConnection();
}
