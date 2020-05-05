package com.mooc.mooc.service.impl;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseTask;
import com.mooc.mooc.service.CourseTaskService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public class CourseTaskServiceImpl implements CourseTaskService {
    @Override
    public PageInfo<CourseTask> list(Integer currPage, Integer pageSize, CourseTask courseTask) {
        return null;
    }

    @Override
    public ResultVO update(CourseTask courseTask) {
        return null;
    }

    @Override
    public ResultVO delete(Integer taskId) {
        return null;
    }

    @Override
    public ResultVO add(CourseTask courseTask) {
        return null;
    }

    @Override
    public ResultVO cancel(Integer taskId) {
        return null;
    }

    @Override
    public CourseTask sel(Integer taskId) {
        return null;
    }
}
