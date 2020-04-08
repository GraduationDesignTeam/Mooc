package com.mooc.mooc.service;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.vo.CourseInfoVO;
import com.mooc.mooc.vo.ResultVO;

public interface CourseService {
    // 查询课程
    PageInfo<CourseInfo> list(Integer currPage, Integer pageSize, CourseInfo courseInfo);

    // 更新课程（注：默认输入参数中的课程id存在）
    ResultVO update(CourseInfo courseInfo);

    // 根据id删除课程
    ResultVO delete(Integer courseId);

    // 添加课程
    ResultVO add(CourseInfo courseInfo);

    // 根据课程id和用户id 获取课程VO
    CourseInfoVO selectVO(Integer courseId, Integer userId);
}
