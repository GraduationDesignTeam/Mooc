package com.mooc.mooc.model;

import java.util.Date;

public class StudentOfCourse {
    private Integer courseUserId;

    private Integer courseId;

    private Integer studentId;

    private Double courseGrade;

    private Date courseTime;

    private String courseEvaluate;

    public Integer getCourseUserId() {
        return courseUserId;
    }

    public void setCourseUserId(Integer courseUserId) {
        this.courseUserId = courseUserId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Double courseGrade) {
        this.courseGrade = courseGrade;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseEvaluate() {
        return courseEvaluate;
    }

    public void setCourseEvaluate(String courseEvaluate) {
        this.courseEvaluate = courseEvaluate == null ? null : courseEvaluate.trim();
    }
}