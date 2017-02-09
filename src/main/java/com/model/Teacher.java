package com.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    private int id;
    private String teacherName;
    private String teacherNumber;
    private String teacherPassword;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "teacher_name", nullable = true, length = 255)
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Basic
    @Column(name = "teacher_number", nullable = true, length = 255)
    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    @Basic
    @Column(name = "teacher_password", nullable = true, length = 255)
    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != teacher.id) return false;
        if (teacherName != null ? !teacherName.equals(teacher.teacherName) : teacher.teacherName != null) return false;
        if (teacherNumber != null ? !teacherNumber.equals(teacher.teacherNumber) : teacher.teacherNumber != null)
            return false;
        if (teacherPassword != null ? !teacherPassword.equals(teacher.teacherPassword) : teacher.teacherPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (teacherNumber != null ? teacherNumber.hashCode() : 0);
        result = 31 * result + (teacherPassword != null ? teacherPassword.hashCode() : 0);
        return result;
    }
}