package com.mooc.mooc.service;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.DiscussionDetail;

public interface DiscussionService {

    // 查询课程
    PageInfo<DiscussionDetail> list(Integer currPage, Integer pageSize, DiscussionDetail discussionDetail);
}
