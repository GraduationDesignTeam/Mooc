package com.mooc.mooc.service;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.vo.ResultVO;

public interface CourseService {

    PageInfo<CourseInfo> list(Integer currPage, Integer pageSize, CourseInfo courseInfo);

    ResultVO update(CourseInfo courseInfo);

    ResultVO delete(Integer courseId);
}
