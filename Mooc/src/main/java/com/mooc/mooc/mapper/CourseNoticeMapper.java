package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseNotice;
import java.util.List;

public interface CourseNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseNotice record);

    CourseNotice selectByPrimaryKey(Integer id);

    List<CourseNotice> selectAll();

    int updateByPrimaryKey(CourseNotice record);

    List<CourseNotice> selectByCourseId(Integer courseId);
}