package com.system.rrhh;

import com.system.com.system.database.DataBase;

import java.sql.SQLException;
import java.sql.Statement;

public class RRHHCrud {

    public void insert(String name) throws SQLException {
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        statement = dataBase.connect().createStatement();

        query = "INSERT INTO user (name) VALUES ('"+ name +"')" ;
        statement.executeUpdate(query);

    }

    public void edit(String name){

    }

    public void delete(String name){

    }

}
