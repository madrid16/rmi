package com.system.rrhh;

import com.system.database.DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RRHHCrud {

    public void insert(String name) throws SQLException {
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        statement = dataBase.connect().createStatement();

        query = "INSERT INTO rrhh (name) VALUES ('"+ name +"')" ;
        statement.executeUpdate(query);

    }

    public void edit(String originalName, String newName) throws SQLException {
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        statement = dataBase.connect().createStatement();

        query = "UPDATE rrhh SET name = '" + newName + "' WHERE rrhh.name = '"+ originalName +"'" ;
        statement.executeUpdate(query);
    }

    public void delete(String name) throws SQLException {
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        statement = dataBase.connect().createStatement();

        query = "DELETE FROM rrhh WHERE rrhh.name = '" + name + "'" ;
        statement.executeUpdate(query);
    }

    public String  get(String name) throws SQLException{
        String query = "";
        Statement statement = null;
        DataBase dataBase = new DataBase();
        ResultSet result = null;
        String username = "";
        statement = dataBase.connect().createStatement();

        query = "SELECT rrhh.name FROM rrhh WHERE rrhh.name = '" + name + "'" ;
        result = statement.executeQuery(query);

        while (result.next()) {
            username = result.getString("name");
        }
        return username;
    }

}
