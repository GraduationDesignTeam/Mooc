package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseSection;
import java.util.List;

public interface CourseSectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSection record);

    CourseSection selectByPrimaryKey(Integer id);

    List<CourseSection> selectAll();

    int updateByPrimaryKey(CourseSection record);
}