package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.CourseInfoMapper;
import com.mooc.mooc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;
}
