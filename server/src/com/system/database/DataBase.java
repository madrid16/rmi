package com.system.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "rmi";
    private final String USER = "";
    private final String PASSWORD = "";
    public Connection connection = null;

    public Connection connect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return connection;
        }
    }

}
