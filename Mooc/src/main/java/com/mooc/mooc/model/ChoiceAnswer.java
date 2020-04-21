package com.mooc.mooc.model;

public class ChoiceAnswer {
    private Integer id;

    private Integer quesetionId;

    private Integer courseId;

    private Integer studentId;

    private Integer answer;

    private Double score;

    public Integer getQuesetionId() {
        return quesetionId;
    }

    public void setQuesetionId(Integer quesetionId) {
        this.quesetionId = quesetionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}