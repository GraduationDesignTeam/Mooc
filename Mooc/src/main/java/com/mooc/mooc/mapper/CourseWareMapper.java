package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseWare;
import java.util.List;

public interface CourseWareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseWare record);

    CourseWare selectByPrimaryKey(Integer id);

    List<CourseWare> selectBySectionId(Integer sectionId);

    List<CourseWare> selectByCourseId(Integer courseId);

    List<CourseWare> selectUnassociatedByCourseId(Integer courseId);

    int updateByPrimaryKey(CourseWare record);
}