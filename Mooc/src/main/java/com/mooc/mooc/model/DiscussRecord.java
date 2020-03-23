package com.mooc.mooc.model;

import java.util.Date;

public class DiscussRecord {
    private Integer discussRecordId;

    private Integer studentId;

    private Integer discussionId;

    private Integer discussState;

    private Date sendTime;

    private Date lastUpdateTime;

    private Date deleteTime;

    private String discussContent;

    private Integer replyRecordId;

    public Integer getDiscussRecordId() {
        return discussRecordId;
    }

    public void setDiscussRecordId(Integer discussRecordId) {
        this.discussRecordId = discussRecordId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(Integer discussionId) {
        this.discussionId = discussionId;
    }

    public Integer getDiscussState() {
        return discussState;
    }

    public void setDiscussState(Integer discussState) {
        this.discussState = discussState;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDiscussContent() {
        return discussContent;
    }

    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent == null ? null : discussContent.trim();
    }

    public Integer getReplyRecordId() {
        return replyRecordId;
    }

    public void setReplyRecordId(Integer replyRecordId) {
        this.replyRecordId = replyRecordId;
    }
}