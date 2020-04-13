package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseTask;
import java.util.List;

public interface CourseTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseTask record);

    CourseTask selectByPrimaryKey(Integer id);

    List<CourseTask> selectAll();

    int updateByPrimaryKey(CourseTask record);
}