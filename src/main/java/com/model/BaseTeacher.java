package com.model;

import javax.persistence.*;

@Entity
@Table(name = "base_teacher", schema = "onelecture", catalog = "")
public class BaseTeacher {
    private int id;
    private String teacherName;
    private String teacherNumber;
    private String teacherCollege;

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
    @Column(name = "teacher_college", nullable = true, length = 255)
    public String getTeacherCollege() {
        return teacherCollege;
    }

    public void setTeacherCollege(String teacherCollege) {
        this.teacherCollege = teacherCollege;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseTeacher that = (BaseTeacher) o;

        if (id != that.id) return false;
        if (teacherName != null ? !teacherName.equals(that.teacherName) : that.teacherName != null) return false;
        if (teacherNumber != null ? !teacherNumber.equals(that.teacherNumber) : that.teacherNumber != null)
            return false;
        if (teacherCollege != null ? !teacherCollege.equals(that.teacherCollege) : that.teacherCollege != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (teacherNumber != null ? teacherNumber.hashCode() : 0);
        result = 31 * result + (teacherCollege != null ? teacherCollege.hashCode() : 0);
        return result;
    }
}