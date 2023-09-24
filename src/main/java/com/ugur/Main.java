package com.ugur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        String jdbcURL = "jdbc:postgresql://localhost:5432/companyDB";
        String kullanici = "postgres";
        String parola = "root";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, kullanici, parola);

            // SQL sorgusu ve parametreleri
            String createTableSQL = "CREATE TABLE kullanicilar ("
                    + "id SERIAL PRIMARY KEY,"
                    + "ad VARCHAR(255),"
                    + "soyad VARCHAR(255),"
                    + "email VARCHAR(255),"
                    + "yas INT"
                    + ")";

            // PreparedStatement oluşturma
            PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL);

            // PreparedStatement'i çalıştırma
            preparedStatement.executeUpdate();

            System.out.println("Tablo oluşturuldu.");

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}