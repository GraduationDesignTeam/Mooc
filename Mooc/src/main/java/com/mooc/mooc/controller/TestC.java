package com.mooc.mooc.controller;

import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.CourseStatistic;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.service.CourseManageService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestC {
    @Resource
    private CourseManageService courseManageService;

    @RequestMapping("/list/assist")
    public List<UserInfo> l_a(){
        return courseManageService.selectAssistantOfCourse(1);
    }

    @RequestMapping("/hello")
    public Boolean check(){
//        System.out.println(courseManageService.isAssistantOfCourse(1,1));
//        return courseManageService.isAssistantOfCourse(1,1);
        System.out.println(courseManageService.isTeacherOfCourse(1,1));
        return courseManageService.isTeacherOfCourse(1,1);
    }

    @RequestMapping("/hi")
    public Boolean check1(){
//        System.out.println(courseManageService.isAssistantOfCourse(2,1));
//        return courseManageService.isAssistantOfCourse(2,1);
        System.out.println(courseManageService.isTeacherOfCourse(1,2));
        return courseManageService.isTeacherOfCourse(1,2);

    }
}
