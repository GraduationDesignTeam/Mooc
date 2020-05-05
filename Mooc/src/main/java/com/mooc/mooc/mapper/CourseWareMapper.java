package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseWare;
import com.mooc.mooc.vo.CourseWareVO;

import java.util.List;

public interface CourseWareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseWare record);

    CourseWareVO selectByPrimaryKey(Integer id);

    List<CourseWareVO> selectBySectionId(Integer sectionId);

    List<CourseWareVO> selectByCourseId(Integer courseId);

    List<CourseWareVO> selectUnassociatedByCourseId(Integer courseId);

    int updateByPrimaryKey(CourseWare record);
}