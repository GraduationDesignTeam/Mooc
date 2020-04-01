package com.mooc.mooc.controller;

import com.mooc.mooc.model.CourseChapter;
import com.mooc.mooc.model.CourseSection;
import com.mooc.mooc.model.CourseWare;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程小节控制器
 */
@RestController
@RequestMapping("/section")
public class CourseSectionController {
    /**
     * 添加章节
     * @param section 小节
     * @return 是否成功
     */
    @RequestMapping("/add")
    ResultVO<CourseChapter> add(@RequestBody CourseSection section){
        return null;
    }

    /**
     * 重命名小节
     * @param section 小节
     * @return 是否成功
     */
    @RequestMapping("/update")
    ResultVO<CourseChapter> update(@RequestBody CourseSection section){
        return null;
    }

    /**
     * 删除小节
     * @param sectionId 小节编号
     * @return 是否成功
     */
    @RequestMapping("/del/{sectionId}")
    ResultVO del(@PathVariable Integer sectionId){
        return null;
    }

    /**
     * 查看当前小节的全部课件
     * @param sectionId 小节编号
     * @return 课件列表
     */
    @RequestMapping("/selCourseWare/{sectionId}")
    List<CourseWare> selCourseWare(@PathVariable Integer sectionId){
        return null;
    }
}
