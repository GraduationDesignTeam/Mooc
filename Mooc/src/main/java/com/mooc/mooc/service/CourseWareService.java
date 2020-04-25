package com.mooc.mooc.service;

import com.mooc.mooc.model.CourseWare;
import com.mooc.mooc.vo.ResultVO;

import java.util.List;

public interface CourseWareService {
    ResultVO add(CourseWare courseWare);
    ResultVO update(CourseWare courseWare);
    ResultVO delete(Integer courseWareId);
    // 根据小节编号获取课件列表
    List<CourseWare> selectBySectionId(Integer sectionId);
    // 根据课程编号获取课件列表
    List<CourseWare> selectByCourseId(Integer courseId);
    // 根据课程编号获取未关联到小节的课件列表
    List<CourseWare> selectUnassociatedByCourseId(Integer courseId);
}
