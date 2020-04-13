package com.mooc.mooc.model;

public class SubjectiveQuestion {
    private Integer id;

    private Integer couseId;

    private String content;

    private String ansewer;

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

    public String getAnsewer() {
        return ansewer;
    }

    public void setAnsewer(String ansewer) {
        this.ansewer = ansewer == null ? null : ansewer.trim();
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