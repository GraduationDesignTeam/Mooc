package com.mooc.mooc.model;

/**
 * @author 朱翔鹏
 * 讨论热度数据封装对象
 */
public class DiscussionStatistic {

    //讨论对象
    private DiscussionInfo discussionInfo;

    //热度值
    private Integer popularity;

    public DiscussionInfo getDiscussionInfo() {
        return discussionInfo;
    }

    public void setDiscussionInfo(DiscussionInfo discussionInfo) {
        this.discussionInfo = discussionInfo;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}
