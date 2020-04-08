package com.mooc.mooc.mapper;

import com.mooc.mooc.model.AssistantOfCourse;
import java.util.List;

import com.mooc.mooc.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface AssistantOfCourseMapper {
    int deleteByPrimaryKey(@Param("courseId") Integer courseId, @Param("assistantId") Integer assistantId);

    int insert(AssistantOfCourse record);

    List<UserInfo> selectAssistantOfCourse(@Param("courseId") Integer courseId);

    Integer count(@Param("courseId") Integer courseId, @Param("assistantId") Integer assistantId);
}