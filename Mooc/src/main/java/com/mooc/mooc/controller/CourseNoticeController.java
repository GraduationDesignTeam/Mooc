package com.mooc.mooc.controller;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.CourseNotice;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程公告控制器
 * 用于设置授课教师、设置课程助教、发布课程公告等
 */
@RestController
@RequestMapping("/course_notice")
public class CourseNoticeController {

    /**
     * 发布新的课程公告
     * @param courseNotice 公告信息
     * @return 是否成功
     */
    @RequestMapping("/add")
    public ResultVO add(CourseNotice courseNotice){
        return null;
    }

    /**
     * 删除公告
     * @param id 公告id
     * @param userId 用户id
     * @return 是否成功
     */
    @RequestMapping("/del/{id}")
    public ResultVO del(@PathVariable Integer id, @RequestBody Integer userId){
        return null;
    }

    /**
     * 查询某条公告
     * @param id 公告id
     * @return 是否成功
     */
    @RequestMapping("/sel/{id}")
    public CourseNotice selOne(@PathVariable Integer id){
        return null;
    }

    /**
     * 分页查询某课程的公告
     * @param currPage 页号
     * @param courseId 课程编号
     * @return List<CourseNotice>
     * 检索结果表，按发布时间，最新的在前面
     */
    @RequestMapping("/list/{currPage}")
    public PageInfo<CourseNotice> list(@PathVariable Integer currPage, @RequestBody Integer courseId){
        return null;
    }
}
