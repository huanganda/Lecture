package com.dao;

import com.model.CourseOverview;

public class CourseOverviewDao extends BaseDao<CourseOverview> {

    private CourseOverviewDao() {
    }

    public static CourseOverviewDao dao;

    public static CourseOverviewDao getInstance() {
        if (null == dao) {
            dao = new CourseOverviewDao();
        }
        return dao;
    }

}