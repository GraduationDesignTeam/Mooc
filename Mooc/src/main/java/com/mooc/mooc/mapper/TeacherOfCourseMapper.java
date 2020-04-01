package com.mooc.mooc.mapper;

import com.mooc.mooc.model.TeacherOfCourse;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherOfCourseMapper {
    int deleteByPrimaryKey(@Param("courseId") Integer courseId, @Param("teacherId") Integer teacherId);

    int insert(TeacherOfCourse record);

    List<TeacherOfCourse> selectAll();
}