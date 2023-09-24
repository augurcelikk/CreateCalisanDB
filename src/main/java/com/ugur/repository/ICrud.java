package com.ugur.repository;

public interface ICrud <T>{

    boolean createTable();

    boolean save(T t);
}
