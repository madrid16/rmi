package com.system.finance;


import com.system.database.DataBase;

import java.sql.SQLException;
import java.sql.Statement;

public class FinanceCrud {
    public void insert(String name) throws SQLException {
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        statement = dataBase.connect().createStatement();

        query = "INSERT INTO finance (name) VALUES ('"+ name +"')" ;
        statement.executeUpdate(query);

    }
}
