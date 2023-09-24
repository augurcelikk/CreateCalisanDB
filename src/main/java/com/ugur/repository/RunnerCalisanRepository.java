package com.ugur.repository;

import com.ugur.repository.entity.Calisan;

import java.sql.SQLException;

public class RunnerCalisanRepository {

    public static void main(String[] args) {
        CalisanRepository calisanRepository = new CalisanRepository();


        System.out.println(calisanRepository.save(new Calisan("Uğur","Çelik")));
        System.out.println("Tablo guncellemesi basarili...");
        System.out.println();

    }

}

