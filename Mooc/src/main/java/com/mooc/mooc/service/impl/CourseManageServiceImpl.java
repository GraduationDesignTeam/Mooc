package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.AssistantOfCourseMapper;
import com.mooc.mooc.mapper.TeacherOfCourseMapper;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.service.CourseManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManageServiceImpl implements CourseManageService {
    @Autowired
    private TeacherOfCourseMapper teacherOfCourseMapper;

    @Autowired
    AssistantOfCourseMapper assistantOfCourseMapper;

    @Override
    public Boolean isTeacherOfCourse(Integer courseId, Integer teacherId) {
        return teacherOfCourseMapper.count(courseId, teacherId) > 0;
    }

    @Override
    public Boolean isAssistantOfCourse(Integer courseId, Integer assistantId) {
        return assistantOfCourseMapper.count(courseId, assistantId) > 0;
    }

    @Override
    public List<UserInfo> selectTeacherOfCourse(Integer courseId) {
        return teacherOfCourseMapper.selectTeacherOfCourse(courseId);
    }

    @Override
    public List<UserInfo> selectAssistantOfCourse(Integer courseId) {
        return assistantOfCourseMapper.selectAssistantOfCourse(courseId);
    }
}
