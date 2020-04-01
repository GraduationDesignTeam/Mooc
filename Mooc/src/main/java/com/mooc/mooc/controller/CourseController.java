package com.mooc.mooc.controller;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.CourseStatistic;
import com.mooc.mooc.service.CourseService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程控制器模块
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    /**
     * @author 朱翔鹏
     * 在数据统计功能下，管理员可以查看系统内课程的实时热度排行榜
     * （后续开发考虑使用某种形象的echart来展现）；并选择是否将其发布在门户网站中
     * @param courseInfo
     * CourseInfo,统计条件（同名/同专业/时间/同教师等）
     * @return
     * List<CourseStatistic>
     * List:用于(echarts)图表的数据list
     * 每个list项是一个CourseStatistic对象:{courseInfo,popularity}
     */
    @RequestMapping("/coursePopularity")
    public List<CourseStatistic> coursePopularity(@RequestBody CourseInfo courseInfo){
        return null;
    }

    /**
     * @author 朱翔鹏
     * 管理员处理开课请求，查看课程信息后，点击审核通过或不通过
     * @param courseInfo
     * @return
     * 审核通过：ResultVO{code:0,msg:”该课程通过审核”}
     * 审核不通过：ResultVO{code:1,msg:”该课程未通过审核”}
     */
    @RequestMapping("/verify")
    public ResultVO verify(@RequestBody CourseInfo courseInfo){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 管理员在课程管理页面（列表形式展示系统内所有开设状态的课程），点击某个课程，可以查看详细信息，
     * 点击封禁按钮，（倒数5秒）再点击确认封禁，则完成封禁操作，该课程权限变更为已封禁
     * @param courseId
     * @return
     * 成功封禁：ResultVO:{code:0;msg:”封禁成功” }
     * 封禁失败：ResultVO:{code:1;msg:”封禁失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/prohibit/{courseId}")
    public ResultVO  prohibit(@PathVariable Integer courseId){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 管理员在课程管理页面（列表形式展示系统内所有封禁状态的课程），点击某个课程，可以查看详细信息，
     * 点击解禁按钮，（倒数5秒）再点击确认解禁，则完成解禁操作，该课程权限变更为可选
     * @param courseId
     * @return
     * 成功解禁：ResultVO:{code:0;msg:”解禁成功” }
     * 解禁失败：ResultVO:{code:1;msg:”解禁失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/relieve/{courseId}")
    public ResultVO  relieve(@PathVariable Integer courseId){
        return new ResultVO(0,"");
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
    @RequestMapping("/delete/{courseId}")
    public ResultVO  delete(Integer courseId){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 面向所有用户，根据用户专业/近期参加课程/课程热度/开课时间/结课时间等多重要素，智能检索并排序结果
     * @param userId
     * @param courseInfo
     * userId,用户id
     * course,课程检索条件
     * @return
     *List<CourseInfo>
     * 检索结果表，按先后顺序
     * CourseInfo每个结果的课程信息
     */
    @RequestMapping("/search/{userId}")
    public List<CourseInfo> search(Integer userId,CourseInfo courseInfo){
        return null;
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面新建课程
     * @param courseInfo 课程信息
     * @return
     * 成功添加：ResultVO:{code:0;msg:”添加成功” }
     * 添加失败：ResultVO:{code:1;msg:”添加失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/add")
    public ResultVO add(CourseInfo courseInfo){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面更新课程信息
     * @param courseInfo 课程信息
     * @return
     * 成功更新：ResultVO:{code:0;msg:”更新成功” }
     * 更新失败：ResultVO:{code:1;msg:”更新失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/update")
    public ResultVO update(CourseInfo courseInfo){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 教师在后台页面撤销一个未发布的课程
     * @param courseId 课程编号
     * @return
     * 成功撤销：ResultVO:{code:0;msg:”撤销成功” }
     * 撤销失败：ResultVO:{code:1;msg:”撤销失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/cancel")
    public ResultVO cancel(Integer courseId){
        return new ResultVO(0,"");
    }

    /**
     * @author 涂斌砚
     * 为首页提供分页查询课程列表
     * @param currPage 页号
     * @param courseInfo 检索信息
     * @return List<CourseInfo>
     * 检索结果表，按先后顺序
     */
    @RequestMapping("list/{currPage}")
    public PageInfo<CourseInfo> list(@PathVariable Integer currPage, @RequestBody CourseInfo courseInfo){
        return null;
    }
}
