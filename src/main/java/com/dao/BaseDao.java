package com.dao;

import com.model.LectureFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BaseDao<T> implements IDao<T> {

    protected static Session session;

    static {
        session = LectureFactory.getSession();
    }

    @Override
    public void add(T object) {
        session.clear();
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void delete(T object) {
        session.clear();
        session.beginTransaction();
        session.delete(object);
        session.beginTransaction().commit();
    }

    @Override
    public void update(T object) {
        session.clear();
        session.beginTransaction();
        session.delete(object);
        session.beginTransaction().commit();
    }

    @Override
    public List<T> select(Query<T> query) {
        List<T> result = query.list();
        return result;
    }
}