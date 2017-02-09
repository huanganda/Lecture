package com.dao;

import com.model.Lesson;

public class LessonDao extends BaseDao<Lesson> {

    private LessonDao() {
    }

    private static LessonDao dao;

    public static LessonDao getInstance() {
        if (null == dao) {
            dao = new LessonDao();
        }
        return dao;
    }

}