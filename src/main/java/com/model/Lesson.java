package com.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lesson {
    private int id;
    private String lessonTermId;
    private String lessonInstituteName;
    private String lessonNumber;
    private String lessonName;
    private String lessonMark;
    private String lessonSelectedNumber;
    private String lessonLimitNumber;
    private String lessonType;
    private String lessonTeacherName;
    private String lessonTotalweek;
    private String lessonTime;
    private String lessonLocation;
    private String lessonCreditType;
    private String lessonTips;
    private String lessonAvgCommentMark;
    private Integer lessonMale;
    private Integer lessonFemale;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lesson_term_id", nullable = true, length = 255)
    public String getLessonTermId() {
        return lessonTermId;
    }

    public void setLessonTermId(String lessonTermId) {
        this.lessonTermId = lessonTermId;
    }

    @Basic
    @Column(name = "lesson_institute_name", nullable = true, length = 255)
    public String getLessonInstituteName() {
        return lessonInstituteName;
    }

    public void setLessonInstituteName(String lessonInstituteName) {
        this.lessonInstituteName = lessonInstituteName;
    }

    @Basic
    @Column(name = "lesson_number", nullable = true, length = 255)
    public String getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(String lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    @Basic
    @Column(name = "lesson_name", nullable = true, length = 255)
    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Basic
    @Column(name = "lesson_mark", nullable = true, length = 255)
    public String getLessonMark() {
        return lessonMark;
    }

    public void setLessonMark(String lessonMark) {
        this.lessonMark = lessonMark;
    }

    @Basic
    @Column(name = "lesson_selected_number", nullable = true, length = 255)
    public String getLessonSelectedNumber() {
        return lessonSelectedNumber;
    }

    public void setLessonSelectedNumber(String lessonSelectedNumber) {
        this.lessonSelectedNumber = lessonSelectedNumber;
    }

    @Basic
    @Column(name = "lesson_limit_number", nullable = true, length = 255)
    public String getLessonLimitNumber() {
        return lessonLimitNumber;
    }

    public void setLessonLimitNumber(String lessonLimitNumber) {
        this.lessonLimitNumber = lessonLimitNumber;
    }

    @Basic
    @Column(name = "lesson_type", nullable = true, length = 255)
    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    @Basic
    @Column(name = "lesson_teacher_name", nullable = true, length = 255)
    public String getLessonTeacherName() {
        return lessonTeacherName;
    }

    public void setLessonTeacherName(String lessonTeacherName) {
        this.lessonTeacherName = lessonTeacherName;
    }

    @Basic
    @Column(name = "lesson_totalweek", nullable = true, length = 255)
    public String getLessonTotalweek() {
        return lessonTotalweek;
    }

    public void setLessonTotalweek(String lessonTotalweek) {
        this.lessonTotalweek = lessonTotalweek;
    }

    @Basic
    @Column(name = "lesson_time", nullable = true, length = 255)
    public String getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    @Basic
    @Column(name = "lesson_location", nullable = true, length = 255)
    public String getLessonLocation() {
        return lessonLocation;
    }

    public void setLessonLocation(String lessonLocation) {
        this.lessonLocation = lessonLocation;
    }

    @Basic
    @Column(name = "lesson_credit_type", nullable = true, length = 255)
    public String getLessonCreditType() {
        return lessonCreditType;
    }

    public void setLessonCreditType(String lessonCreditType) {
        this.lessonCreditType = lessonCreditType;
    }

    @Basic
    @Column(name = "lesson_tips", nullable = true, length = 255)
    public String getLessonTips() {
        return lessonTips;
    }

    public void setLessonTips(String lessonTips) {
        this.lessonTips = lessonTips;
    }

    @Basic
    @Column(name = "lesson_avg_comment_mark", nullable = true, length = 255)
    public String getLessonAvgCommentMark() {
        return lessonAvgCommentMark;
    }

    public void setLessonAvgCommentMark(String lessonAvgCommentMark) {
        this.lessonAvgCommentMark = lessonAvgCommentMark;
    }

    @Basic
    @Column(name = "lesson_male", nullable = true)
    public Integer getLessonMale() {
        return lessonMale;
    }

    public void setLessonMale(Integer lessonMale) {
        this.lessonMale = lessonMale;
    }

    @Basic
    @Column(name = "lesson_female", nullable = true)
    public Integer getLessonFemale() {
        return lessonFemale;
    }

    public void setLessonFemale(Integer lessonFemale) {
        this.lessonFemale = lessonFemale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (id != lesson.id) return false;
        if (lessonTermId != null ? !lessonTermId.equals(lesson.lessonTermId) : lesson.lessonTermId != null)
            return false;
        if (lessonInstituteName != null ? !lessonInstituteName.equals(lesson.lessonInstituteName) : lesson.lessonInstituteName != null)
            return false;
        if (lessonNumber != null ? !lessonNumber.equals(lesson.lessonNumber) : lesson.lessonNumber != null)
            return false;
        if (lessonName != null ? !lessonName.equals(lesson.lessonName) : lesson.lessonName != null) return false;
        if (lessonMark != null ? !lessonMark.equals(lesson.lessonMark) : lesson.lessonMark != null) return false;
        if (lessonSelectedNumber != null ? !lessonSelectedNumber.equals(lesson.lessonSelectedNumber) : lesson.lessonSelectedNumber != null)
            return false;
        if (lessonLimitNumber != null ? !lessonLimitNumber.equals(lesson.lessonLimitNumber) : lesson.lessonLimitNumber != null)
            return false;
        if (lessonType != null ? !lessonType.equals(lesson.lessonType) : lesson.lessonType != null) return false;
        if (lessonTeacherName != null ? !lessonTeacherName.equals(lesson.lessonTeacherName) : lesson.lessonTeacherName != null)
            return false;
        if (lessonTotalweek != null ? !lessonTotalweek.equals(lesson.lessonTotalweek) : lesson.lessonTotalweek != null)
            return false;
        if (lessonTime != null ? !lessonTime.equals(lesson.lessonTime) : lesson.lessonTime != null) return false;
        if (lessonLocation != null ? !lessonLocation.equals(lesson.lessonLocation) : lesson.lessonLocation != null)
            return false;
        if (lessonCreditType != null ? !lessonCreditType.equals(lesson.lessonCreditType) : lesson.lessonCreditType != null)
            return false;
        if (lessonTips != null ? !lessonTips.equals(lesson.lessonTips) : lesson.lessonTips != null) return false;
        if (lessonAvgCommentMark != null ? !lessonAvgCommentMark.equals(lesson.lessonAvgCommentMark) : lesson.lessonAvgCommentMark != null)
            return false;
        if (lessonMale != null ? !lessonMale.equals(lesson.lessonMale) : lesson.lessonMale != null) return false;
        if (lessonFemale != null ? !lessonFemale.equals(lesson.lessonFemale) : lesson.lessonFemale != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lessonTermId != null ? lessonTermId.hashCode() : 0);
        result = 31 * result + (lessonInstituteName != null ? lessonInstituteName.hashCode() : 0);
        result = 31 * result + (lessonNumber != null ? lessonNumber.hashCode() : 0);
        result = 31 * result + (lessonName != null ? lessonName.hashCode() : 0);
        result = 31 * result + (lessonMark != null ? lessonMark.hashCode() : 0);
        result = 31 * result + (lessonSelectedNumber != null ? lessonSelectedNumber.hashCode() : 0);
        result = 31 * result + (lessonLimitNumber != null ? lessonLimitNumber.hashCode() : 0);
        result = 31 * result + (lessonType != null ? lessonType.hashCode() : 0);
        result = 31 * result + (lessonTeacherName != null ? lessonTeacherName.hashCode() : 0);
        result = 31 * result + (lessonTotalweek != null ? lessonTotalweek.hashCode() : 0);
        result = 31 * result + (lessonTime != null ? lessonTime.hashCode() : 0);
        result = 31 * result + (lessonLocation != null ? lessonLocation.hashCode() : 0);
        result = 31 * result + (lessonCreditType != null ? lessonCreditType.hashCode() : 0);
        result = 31 * result + (lessonTips != null ? lessonTips.hashCode() : 0);
        result = 31 * result + (lessonAvgCommentMark != null ? lessonAvgCommentMark.hashCode() : 0);
        result = 31 * result + (lessonMale != null ? lessonMale.hashCode() : 0);
        result = 31 * result + (lessonFemale != null ? lessonFemale.hashCode() : 0);
        return result;
    }
}