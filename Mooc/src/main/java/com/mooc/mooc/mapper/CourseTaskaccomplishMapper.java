package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseTask;
import com.mooc.mooc.model.CourseTaskaccomplish;

import java.util.List;

public interface CourseTaskaccomplishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseTaskaccomplish record);

    CourseTaskaccomplish selectByPrimaryKey(Integer id);

    List<CourseTaskaccomplish> selectAll();

    int updateByPrimaryKey(CourseTaskaccomplish record);
}