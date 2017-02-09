package com.dao;

import com.model.Teacher;

public class TeacherDao extends BaseDao<Teacher> {

    private TeacherDao() {
    }

    private static TeacherDao dao;

    public static TeacherDao getInstance() {
        if (null == dao) {
            dao = new TeacherDao();
        }
        return dao;
    }

}