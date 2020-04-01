package com.mooc.mooc.mapper;

import com.mooc.mooc.model.course_ware;
import java.util.List;

public interface course_wareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(course_ware record);

    course_ware selectByPrimaryKey(Integer id);

    List<course_ware> selectAll();

    int updateByPrimaryKey(course_ware record);
}