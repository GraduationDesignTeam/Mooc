package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.UserInfo;

import java.util.List;

public interface CourseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer id);

    List<CourseInfo> selectAll();

    int updateByPrimaryKey(CourseInfo record);

    List<CourseInfo> queryAll(CourseInfo courseInfo);
}