package com.mooc.mooc.model;

import java.util.Date;

public class DiscussRecord {
    private Integer discussRecordId;

    private Integer userId;

    private Integer discussionId;

    private Integer discussState;

    private Date sendTime;

    private Date lastUpdateTime;

    private Date deleteTime;

    private String discussContent;

    private Integer replyRecordId;

    private String userName;

    public Integer getDiscussRecordId() {
        return discussRecordId;
    }

    public void setDiscussRecordId(Integer discussRecordId) {
        this.discussRecordId = discussRecordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}