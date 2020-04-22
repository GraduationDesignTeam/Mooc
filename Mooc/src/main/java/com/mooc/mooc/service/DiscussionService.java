package com.mooc.mooc.service;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.DiscussionDetail;

public interface DiscussionService {

    // 查询讨论，排序从新到旧，默认方式
    PageInfo<DiscussionDetail> listNew(Integer currPage, Integer pageSize, DiscussionDetail discussionDetail);

    // 查询讨论，排序按热度从高到底
    PageInfo<DiscussionDetail> listHot(Integer currPage, Integer pageSize, DiscussionDetail discussionDetail);
}
