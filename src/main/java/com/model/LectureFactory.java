package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class LectureFactory {

    private static SessionFactory sessionFactory;
    private static Session session;

    private LectureFactory() {

    }

    public static Session getSession() {
        if (null == sessionFactory) {
            File file = new File("src/main/resources/hibernate.cfg.xml");
            Configuration configuration = new Configuration().configure(file);
            sessionFactory = configuration.buildSessionFactory();
        }
        if (null == session || !session.isConnected() || !session.isConnected()) {
            session = sessionFactory.openSession();
        }
        return session;
    }
}