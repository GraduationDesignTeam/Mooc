package com.mooc.mooc.mapper;

import com.mooc.mooc.model.CourseChapter;
import java.util.List;

public interface CourseChapterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseChapter record);

    CourseChapter selectByPrimaryKey(Integer id);

    List<CourseChapter> selectAll();

    int updateByPrimaryKey(CourseChapter record);
}