package com.dao;

public class StudentDao extends BaseDao<StudentDao> {

    private StudentDao() {
    }

    private static StudentDao dao;

    public static StudentDao getInstance() {
        if (null == dao) {
            dao = new StudentDao();
        }
        return dao;
    }

}