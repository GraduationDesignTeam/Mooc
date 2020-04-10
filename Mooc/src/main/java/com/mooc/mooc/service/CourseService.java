package com.mooc.mooc.service;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.vo.CourseInfoVO;
import com.mooc.mooc.vo.ResultVO;

import java.util.List;

public interface CourseService {
    // 查询课程
    PageInfo<CourseInfo> list(Integer currPage, Integer pageSize, CourseInfo courseInfo);

    // 根据学校查询课程
    PageInfo<CourseInfo> list(Integer currPage, Integer pageSize, String school);

    // 更新课程（注：默认输入参数中的课程id存在）
    ResultVO update(CourseInfo courseInfo);

    // 根据id删除课程
    ResultVO delete(Integer courseId);

    // 教师添加课程
    ResultVO add(CourseInfo courseInfo);

    // 根据id查询某课程
    CourseInfo sel(Integer courseId);

    // 根据课程id和用户id 获取课程VO
    CourseInfoVO selectVO(Integer courseId, Integer userId);

    //根据教师id查询课程
    List<CourseInfo> getByTeacherId(Integer teacherId);

    //根据助教id查询课程
    List<CourseInfo> getByAssistantId(Integer assistantId);
}
