package com.mooc.mooc.service;

import com.mooc.mooc.model.UserInfo;

import java.util.List;

public interface CourseManageService {
    Boolean isTeacherOfCourse(Integer courseId, Integer teacherId);
    Boolean isAssistantOfCourse(Integer courseId, Integer assistantId);
    List<UserInfo> selectAssistantOfCourse(Integer courseId);
    List<UserInfo> selectTeacherOfCourse(Integer courseId);
}
