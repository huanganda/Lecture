package com.dao;

import org.hibernate.query.Query;

import java.util.List;

public interface IDao<T> {

    void add(T object);

    void delete(T object);

    void update(T object);

    List<T> select(Query<T> query);

}