package com.model;

public class CourseOverview {
    private int id;
    private String courseOverviewStudentNumber;
    private String courseOverviewStudentName;
    private String courseOverviewStudentMajor;
    private String courseOverviewStudentSex;
    private String courseOverviewLessonId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseOverviewStudentNumber() {
        return courseOverviewStudentNumber;
    }

    public void setCourseOverviewStudentNumber(String courseOverviewStudentNumber) {
        this.courseOverviewStudentNumber = courseOverviewStudentNumber;
    }

    public String getCourseOverviewStudentName() {
        return courseOverviewStudentName;
    }

    public void setCourseOverviewStudentName(String courseOverviewStudentName) {
        this.courseOverviewStudentName = courseOverviewStudentName;
    }

    public String getCourseOverviewStudentMajor() {
        return courseOverviewStudentMajor;
    }

    public void setCourseOverviewStudentMajor(String courseOverviewStudentMajor) {
        this.courseOverviewStudentMajor = courseOverviewStudentMajor;
    }

    public String getCourseOverviewStudentSex() {
        return courseOverviewStudentSex;
    }

    public void setCourseOverviewStudentSex(String courseOverviewStudentSex) {
        this.courseOverviewStudentSex = courseOverviewStudentSex;
    }

    public String getCourseOverviewLessonId() {
        return courseOverviewLessonId;
    }

    public void setCourseOverviewLessonId(String courseOverviewLessonId) {
        this.courseOverviewLessonId = courseOverviewLessonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseOverview that = (CourseOverview) o;

        if (id != that.id) return false;
        if (courseOverviewStudentNumber != null ? !courseOverviewStudentNumber.equals(that.courseOverviewStudentNumber) : that.courseOverviewStudentNumber != null)
            return false;
        if (courseOverviewStudentName != null ? !courseOverviewStudentName.equals(that.courseOverviewStudentName) : that.courseOverviewStudentName != null)
            return false;
        if (courseOverviewStudentMajor != null ? !courseOverviewStudentMajor.equals(that.courseOverviewStudentMajor) : that.courseOverviewStudentMajor != null)
            return false;
        if (courseOverviewStudentSex != null ? !courseOverviewStudentSex.equals(that.courseOverviewStudentSex) : that.courseOverviewStudentSex != null)
            return false;
        if (courseOverviewLessonId != null ? !courseOverviewLessonId.equals(that.courseOverviewLessonId) : that.courseOverviewLessonId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (courseOverviewStudentNumber != null ? courseOverviewStudentNumber.hashCode() : 0);
        result = 31 * result + (courseOverviewStudentName != null ? courseOverviewStudentName.hashCode() : 0);
        result = 31 * result + (courseOverviewStudentMajor != null ? courseOverviewStudentMajor.hashCode() : 0);
        result = 31 * result + (courseOverviewStudentSex != null ? courseOverviewStudentSex.hashCode() : 0);
        result = 31 * result + (courseOverviewLessonId != null ? courseOverviewLessonId.hashCode() : 0);
        return result;
    }
}