package com.mooc.mooc.model;

public class ChoiceQuestion {
    private Integer id;

    private Integer couseId;

    private String content;

    private String op1;

    private String op2;

    private String op3;

    private String op4;

    private Integer answer;

    private String resolution;

    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouseId() {
        return couseId;
    }

    public void setCouseId(Integer couseId) {
        this.couseId = couseId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1 == null ? null : op1.trim();
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2 == null ? null : op2.trim();
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3 == null ? null : op3.trim();
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4 == null ? null : op4.trim();
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}