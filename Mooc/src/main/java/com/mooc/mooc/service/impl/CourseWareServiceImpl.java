package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.CourseWareMapper;
import com.mooc.mooc.model.CourseWare;
import com.mooc.mooc.service.CourseWareService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseWareServiceImpl implements CourseWareService {
    @Autowired
    private CourseWareMapper courseWareMapper;

    @Override
    public ResultVO add(CourseWare courseWare) {
        if(courseWareMapper.insert(courseWare) > 0)
            return new ResultVO(0, "课件创建成功");
        return new ResultVO(1, "课件添加过程中出错，请稍后重试！");
    }

    @Override
    public ResultVO update(CourseWare courseWare) {
        if(courseWareMapper.updateByPrimaryKey(courseWare) > 0)
            return new ResultVO(0, "课件信息更新成功");
        return new ResultVO(1, "课件更新过程中出错，请稍后重试！");
    }

    @Override
    public ResultVO delete(Integer courseWareId) {
        courseWareMapper.deleteByPrimaryKey(courseWareId);
        return new ResultVO(0, "课件删除成功");
    }

    @Override
    public List<CourseWare> selectBySectionId(Integer sectionId) {
        return courseWareMapper.selectBySectionId(sectionId);
    }

    @Override
    public List<CourseWare> selectByCourseId(Integer courseId) {
        return courseWareMapper.selectByCourseId(courseId);
    }

    @Override
    public List<CourseWare> selectUnassociatedByCourseId(Integer courseId) {
        return courseWareMapper.selectUnassociatedByCourseId(courseId);
    }
}
