package com.model;

public class Student {
    private int id;
    private String studentName;
    private String studentNickname;
    private String studentPassword;
    private String studentMajor;
    private String studentEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNickname() {
        return studentNickname;
    }

    public void setStudentNickname(String studentNickname) {
        this.studentNickname = studentNickname;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (studentNickname != null ? !studentNickname.equals(student.studentNickname) : student.studentNickname != null)
            return false;
        if (studentPassword != null ? !studentPassword.equals(student.studentPassword) : student.studentPassword != null)
            return false;
        if (studentMajor != null ? !studentMajor.equals(student.studentMajor) : student.studentMajor != null)
            return false;
        if (studentEmail != null ? !studentEmail.equals(student.studentEmail) : student.studentEmail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentNickname != null ? studentNickname.hashCode() : 0);
        result = 31 * result + (studentPassword != null ? studentPassword.hashCode() : 0);
        result = 31 * result + (studentMajor != null ? studentMajor.hashCode() : 0);
        result = 31 * result + (studentEmail != null ? studentEmail.hashCode() : 0);
        return result;
    }
}