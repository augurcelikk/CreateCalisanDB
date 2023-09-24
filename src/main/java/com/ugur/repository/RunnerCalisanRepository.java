package com.ugur.repository;

import com.ugur.repository.entity.Calisan;

import java.sql.SQLException;

public class RunnerCalisanRepository {

    public static void main(String[] args) {
        CalisanRepository calisanRepository = new CalisanRepository();

//        calisanRepository.createTable();

       System.out.println(calisanRepository.save(new Calisan("Uğur","Çelik")));

    }

}

