package com.mooc.mooc.model;

import java.util.Date;

public class InformationInfo {
    private Integer informationId;

    private Integer senderId;

    private Integer addresseeId;

    private Date sendTime;

    private String informationContent;

    private Integer informationState;

    private Integer discussionId;

    private Integer discussRecordId;

    private Integer personMessageId;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getAddresseeId() {
        return addresseeId;
    }

    public void setAddresseeId(Integer addresseeId) {
        this.addresseeId = addresseeId;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent == null ? null : informationContent.trim();
    }

    public Integer getInformationState() {
        return informationState;
    }

    public void setInformationState(Integer informationState) {
        this.informationState = informationState;
    }

    public Integer getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(Integer discussionId) {
        this.discussionId = discussionId;
    }

    public Integer getDiscussRecordId() {
        return discussRecordId;
    }

    public void setDiscussRecordId(Integer discussRecordId) {
        this.discussRecordId = discussRecordId;
    }

    public Integer getPersonMessageId() {
        return personMessageId;
    }

    public void setPersonMessageId(Integer personMessageId) {
        this.personMessageId = personMessageId;
    }
}