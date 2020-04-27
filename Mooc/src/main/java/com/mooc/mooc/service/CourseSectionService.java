package com.mooc.mooc.service;

import com.mooc.mooc.model.CourseSection;
import com.mooc.mooc.vo.ResultVO;

import java.util.List;

public interface CourseSectionService {
    ResultVO add(CourseSection section);
    ResultVO update(CourseSection section);
    ResultVO delete(Integer sectionId);
//    List<CourseChapter> selectByChapterId(Integer chapterId);
}
