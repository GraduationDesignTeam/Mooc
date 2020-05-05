package com.mooc.mooc.controller;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.CourseTask;
import com.mooc.mooc.service.CourseService;
import com.mooc.mooc.service.CourseTaskService;
import com.mooc.mooc.util.Define;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 课程控制器模块
 */
@RestController
@RequestMapping("/coursetask")
public class CourseTaskController {
    @Resource
    private CourseTaskService courseTaskService;

    /**
     * @author 田冠宇
     * 为首页提供分页查询任务列表
     * @param currPage 页号
     * @param coursetask 检索信息等
     * @return List<CourseInfo>
     * 检索结果表，按先后顺序
     */
    @RequestMapping("/list/{currPage}")
    public PageInfo<CourseTask> list(@PathVariable Integer currPage, @RequestBody CourseTask coursetask){
        PageInfo<CourseTask> list1=courseTaskService.list(currPage, Define.PAGE_SIZE,coursetask);
        //System.out.println(list1.getList().get(0).getProhibitState());
        return list1;
    }
}
