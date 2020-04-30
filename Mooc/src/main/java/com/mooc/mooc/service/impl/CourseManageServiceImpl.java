package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.AssistantOfCourseMapper;
import com.mooc.mooc.mapper.StudentOfCourseMapper;
import com.mooc.mooc.mapper.TeacherOfCourseMapper;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.service.CourseManageService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Service
public class CourseManageServiceImpl implements CourseManageService {
    @Autowired
    private TeacherOfCourseMapper teacherOfCourseMapper;

    @Autowired
    AssistantOfCourseMapper assistantOfCourseMapper;

    @Autowired
    StudentOfCourseMapper studentOfCourseMapper;

    @Override
    public Boolean isTeacherOfCourse(Integer courseId, Integer teacherId) {
        return teacherOfCourseMapper.count(courseId, teacherId) > 0;
    }

    @Override
    public Boolean isAssistantOfCourse(Integer courseId, Integer assistantId) {
        return assistantOfCourseMapper.count(courseId, assistantId) > 0;
    }

    @Override
    public Boolean isStudentOfCourse(Integer courseId, Integer studentId) {
        return studentOfCourseMapper.count(courseId, studentId) > 0;
    }

    @Override
    public ResultVO addTeacher(Integer courseId, Integer teacherId) {
        try{
            teacherOfCourseMapper.insert(courseId, teacherId);
        } catch (Exception e){
            return new ResultVO(1, "请勿重复添加！");
        }
        return new ResultVO(0, "操作成功");
    }

    @Override
    public ResultVO addAssistant(Integer courseId, Integer assistantId) {
        try{
            assistantOfCourseMapper.insert(courseId, assistantId);
        } catch (Exception e){
            return new ResultVO(1, "请勿重复添加！");
        }
        return new ResultVO(0, "操作成功");
    }

    @Override
    public ResultVO removeTeacher(Integer courseId, Integer teacherId) {
        teacherOfCourseMapper.deleteByPrimaryKey(courseId, teacherId);
        return new ResultVO(0, "操作成功");
    }

    @Override
    public ResultVO removeAssistant(Integer courseId, Integer assistantId) {
        assistantOfCourseMapper.deleteByPrimaryKey(courseId, assistantId);
        return new ResultVO(0, "操作成功");
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
