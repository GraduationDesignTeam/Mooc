package com.mooc.mooc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseWare;
import com.mooc.mooc.service.CourseWareService;
import com.mooc.mooc.util.Define;
import com.mooc.mooc.util.FileHelper;
import com.mooc.mooc.vo.CourseWareVO;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 课件控制器
 * 用于上传课件、更新课件、删除课件、获取课件等
 */
@RestController
@RequestMapping("/course_ware")
public class CourseWareController {
    @Autowired
    private CourseWareService courseWareService;
    @Value("${web.course-ware-upload-path}")
    private String courseWarePath;

    /**
     * 添加课件
     * @param courseWare 课件信息
     * @return 是否成功
     */
    @RequestMapping("/add")
    public ResultVO add(@RequestBody CourseWare courseWare){
        return courseWareService.add(courseWare);
    }

    /**
     * 更新课件
     * @param courseWare 课件信息
     * @return 是否成功
     */
    @RequestMapping("/update")
    public ResultVO update(@RequestBody CourseWare courseWare){
        return courseWareService.update(courseWare);
    }

    /**
     * 删除课件
     * @param id 课件编号
     * @return 是否成功
     */
    @RequestMapping("/del/{id}")
    public ResultVO del(@PathVariable Integer id){
        return courseWareService.delete(id);
    }

    /**
     * 删除文件（可用于添加课件页面）
     * @param name 文件名
     */
    @RequestMapping("/remove/{name}")
    public void del(@PathVariable String name){
        FileHelper.delete(courseWarePath, name);
    }

    /**
     * 根据小节编号获取课件列表
     * @param sectionId 小节编号
     * @return 课件列表
     */
    @RequestMapping("/selectBySectionId/{currPage}")
    public PageInfo<CourseWareVO> selectBySectionId(@PathVariable Integer currPage, @RequestParam Integer sectionId){
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        return new PageInfo<>(courseWareService.selectBySectionId(sectionId));
    }

    /**
     * 根据课程编号获取课件列表
     * @param courseId 课程编号
     * @return 课件列表
     */
    @RequestMapping("/selectByCourseId/{currPage}")
    public PageInfo<CourseWareVO> selectByCourseId(@PathVariable Integer currPage, @RequestParam Integer courseId){
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        return new PageInfo<>(courseWareService.selectByCourseId(courseId));
    }

    /**
     * 根据课程编号获取未关联到小节的课件列表
     * @param courseId 课程编号
     * @return 课件列表
     */
    @RequestMapping("/selectUnassociatedByCourseId/{currPage}")
    public PageInfo<CourseWareVO> selectUnassociatedByCourseId(@PathVariable Integer currPage, @RequestParam Integer courseId){
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        return new PageInfo<>(courseWareService.selectUnassociatedByCourseId(courseId));
    }
}
