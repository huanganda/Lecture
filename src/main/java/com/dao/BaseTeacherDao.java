package com.dao;

import com.model.BaseTeacher;

public class BaseTeacherDao extends BaseDao<BaseTeacher> {

    private BaseTeacherDao() {
    }

    public static BaseTeacherDao dao;

    public static BaseTeacherDao getInstance() {
        if (null == dao) {
            dao = new BaseTeacherDao();
        }
        return dao;
    }
}