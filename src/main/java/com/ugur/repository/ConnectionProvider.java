package com.ugur.repository;

import java.sql.*;

public class ConnectionProvider {

    String connectionString = "jdbc:postgresql://localhost:5432/companyDB";
    String username = "postgres";
    String password = "root";
    Connection connection;
    PreparedStatement preparedStatement;


    public boolean openConnection(){
        try {
            connection = DriverManager.getConnection(connectionString,username,password);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean closeConnection(){
        try {
            if(!connection.isClosed()){
                closeConnection();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean executeUpdate(String sqlSorgu){
        if (openConnection()){
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sqlSorgu);
                preparedStatement.executeUpdate();
                return true;
            } catch (SQLException e) {
                closeConnection();
            }
        }
        return false;
    }


}
