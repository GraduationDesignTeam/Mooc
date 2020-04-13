package com.mooc.mooc.model;

import java.util.Date;

public class PersonMessage {
    private Integer msgId;

    private Integer msgType;

    private Integer msgPost;

    private Integer msgGet;

    private Date msgTime;

    private String msgContent;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgPost() {
        return msgPost;
    }

    public void setMsgPost(Integer msgPost) {
        this.msgPost = msgPost;
    }

    public Integer getMsgGet() {
        return msgGet;
    }

    public void setMsgGet(Integer msgGet) {
        this.msgGet = msgGet;
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }
}