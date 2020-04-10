package com.mooc.mooc.mapper;

import java.util.List;

import com.mooc.mooc.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface TeacherOfCourseMapper {
    int deleteByPrimaryKey(@Param("courseId") Integer courseId, @Param("teacherId") Integer teacherId);

    int insert(@Param("courseId") Integer courseId, @Param("teacherId") Integer teacherId);

    List<UserInfo> selectTeacherOfCourse(@Param("courseId") Integer courseId);

    Integer count(@Param("courseId") Integer courseId, @Param("teacherId") Integer teacherId);
}