package com.mooc.mooc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.mooc.mapper.CourseInfoMapper;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.service.CourseService;
import com.mooc.mooc.vo.CourseInfoVO;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    /**
     * @author 涂斌砚
     * 为首页提供分页查询课程列表
     * @param currPage 页号
     * @param courseInfo 检索信息 - 可为空、课程名称、课程类别、开课教师姓名等
     * @return List<CourseInfo>
     * 检索结果表，按先后顺序
     */
    @Override
    public PageInfo<CourseInfo> list(Integer currPage, Integer pageSize, CourseInfo courseInfo) {
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, pageSize);
        PageInfo<CourseInfo> courseInfoPageInfo=new PageInfo<>(courseInfoMapper.queryAll(courseInfo));
        return courseInfoPageInfo;
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面更新课程信息
     * @param courseInfo 课程信息
     * @return
     * 成功更新：ResultVO:{code:0;msg:”更新成功” }
     * 更新失败：ResultVO:{code:1;msg:”更新失败” }【msg中应包含详细错误信息】
     */
    @Override
    public ResultVO update(CourseInfo courseInfo) {
        ResultVO resultVO=new ResultVO();
        List<CourseInfo> list=courseInfoMapper.selectAll();
        for(int i=0;i<list.size();i++){
            if(courseInfo.getName().equals("")||courseInfo.getName().equals(null)){
                resultVO.setCode(1);
                resultVO.setMsg("课程名不能为空");
                return resultVO;
            }
        }
        courseInfoMapper.updateByPrimaryKey(courseInfo);
        resultVO.setCode(0);
        resultVO.setMsg("更新成功");
        return resultVO;
    }

    /**
     * @author 朱翔鹏
     * 管理员在课程管理页面（列表形式展示系统内所有已结束状态的课程），点击某个课程，可以查看详细信息，
     * 点击删除按钮，（倒数5秒）再点击确认删除，则完成删除操作，该课程相关表记录、文件等全部从系统中删除
     * @param courseId
     * @return
     * 成功删除：ResultVO:{code:0;msg:”删除成功” }
     * 删除失败：ResultVO:{code:1;msg:”删除失败” }【msg中应包含详细错误信息】
     */
    @Override
    public ResultVO delete(Integer courseId) {
        ResultVO resultVO=new ResultVO();
        courseInfoMapper.deleteByPrimaryKey(courseId);
        resultVO.setCode(0);
        resultVO.setMsg("删除成功");
        return resultVO;
    }

    @Override
    public ResultVO add(CourseInfo courseInfo) {
        ResultVO resultVO=new ResultVO();
        if(courseInfo.getName()==null||courseInfo.getName().trim().length()==0){
            resultVO.setCode(1);
            resultVO.setMsg("课程名不可为空");
        }
        else{
            if(courseInfoMapper.insert(courseInfo) > 0){
                resultVO.setCode(0);
                resultVO.setMsg("添加成功");
            }
        }
        return resultVO;
    }

    @Override
    public CourseInfoVO selectVO(Integer courseId, Integer userId) {
        CourseInfoVO courseInfoVO =  courseInfoMapper.selectVO(courseId);
        /**
         * 尚未完成
         * 此处需要另从三张表里读取用户在这门课程里扮演的角色
         */
        courseInfoVO.setRole(0);
        return courseInfoVO;
    }
}
