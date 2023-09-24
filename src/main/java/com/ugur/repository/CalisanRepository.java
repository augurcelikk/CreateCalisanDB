package com.ugur.repository;

import com.ugur.repository.entity.Calisan;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class CalisanRepository implements ICrud<Calisan>{
    private ConnectionProvider connectionProvider;

    public CalisanRepository(){
        this.connectionProvider = new ConnectionProvider();
    }

    @Override
    public boolean createTable() {
        String sqlCreateQuery = "CREATE TABLE calisan ("
                + "id SERIAL PRIMARY KEY,"
                + "isim VARCHAR(30),"
                + "soyisim VARCHAR(30),"
                + ")";

        return connectionProvider.executeUpdate(sqlCreateQuery);
    }

    @Override
    public boolean save(Calisan calisan) {
        String sqlSaveQuery = "INSERT INTO calisan(isim, soyisim) VALUES('"
                + calisan.getIsim() + "','"
                + calisan.getSoyisim() + "')";
        return connectionProvider.executeUpdate(sqlSaveQuery);
    }
}
