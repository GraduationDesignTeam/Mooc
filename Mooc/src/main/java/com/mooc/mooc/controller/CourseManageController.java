package com.mooc.mooc.controller;

import com.mooc.mooc.vo.ResultVO;
import com.mooc.mooc.vo.UserInfoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程管理控制器
 * 用于设置授课教师、设置课程助教等
 */
@RestController
@RequestMapping("/course_manage")
public class CourseManageController {

    /**
     * @author 涂斌砚
     * 教师在后台页面查看某课程的所有任课教师
     * @param courseId 课程编号
     * @return
     * List<UserInfoVO>
     */
    @RequestMapping("/get_teacher")
    public List<UserInfoVO> getTeacherList(Integer courseId){
        return null;
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面为一门课程添加一位授课教师
     * @param courseId 课程编号
     * @param teacherId 教师编号
     * @return
     * 成功：ResultVO:{code:0;msg:”操作成功” }
     * 失败：ResultVO:{code:1;msg:”操作失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/add_teacher")
    public ResultVO setTeacherOfCourse(Integer courseId, Integer teacherId){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面为一门课程移除一位授课教师
     * @param courseId 课程编号
     * @param teacherId 教师编号
     * @return
     * 成功：ResultVO:{code:0;msg:”操作成功” }
     * 失败：ResultVO:{code:1;msg:”操作失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/remove_teacher")
    public ResultVO removeTeacherOfCourse(Integer courseId, Integer teacherId){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面查看某课程的所有助教
     * @param courseId 课程编号
     * @return
     * List<UserInfoVO>
     */
    @RequestMapping("/get_assistant")
    public List<UserInfoVO> getAssistantList(Integer courseId){
        return null;
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面为一门课程添加一位助教
     * @param courseId 课程编号
     * @param assistantId 助教编号
     * @return
     * 成功：ResultVO:{code:0;msg:”操作成功” }
     * 失败：ResultVO:{code:1;msg:”操作失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/add_assistant")
    public ResultVO setAssistantOfCourse(Integer courseId, Integer assistantId){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面为一门课程移除一位授课教师
     * @param courseId 课程编号
     * @param assistantId 助教编号
     * @return
     * 成功：ResultVO:{code:0;msg:”操作成功” }
     * 失败：ResultVO:{code:1;msg:”操作失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/remove_assistant")
    public ResultVO removeAssistantOfCourse(Integer courseId, Integer assistantId){
        return new ResultVO(0,"");
    }
}
