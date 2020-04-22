package com.mooc.mooc.controller;

import com.github.pagehelper.PageInfo;
import com.mooc.mooc.model.CourseInfo;
import com.mooc.mooc.model.DiscussionDetail;
import com.mooc.mooc.model.DiscussionInfo;
import com.mooc.mooc.model.DiscussionStatistic;
import com.mooc.mooc.service.DiscussionService;
import com.mooc.mooc.util.Define;
import com.mooc.mooc.vo.DiscussionVO;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讨论控制模块
 */
@RestController
@RequestMapping("/discussion")
public class DiscussionController {

    @Resource
    private DiscussionService discussionService;

    /**
     * @author 朱翔鹏
     * 教师在所教课程页面下，讨论区功能中，点击创建新讨论，填写表单，传入后台，调用此接口
     * @param discussionInfo
     * @return
     * 成功创建：ResultVO:{code:0;msg:”创建成功” }
     * 创建失败：ResultVO:{code:1;msg:”创建失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/create")
    public ResultVO create(@RequestBody DiscussionInfo discussionInfo){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 教师在所教课程页面下，讨论区功能中，进入讨论区管理页面（列表形式展示所有该教师创建的讨论），
     * 可以选择某个讨论，编辑其详细信息
     * @param discussionInfo
     * @return
     * 成功创建：ResultVO:{code:0;msg:”修改成功” }
     * 创建失败：ResultVO:{code:1;msg:”修改失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/update")
    public ResultVO  update(@RequestBody DiscussionInfo discussionInfo){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 教师在所教课程页面下，讨论区功能中，进入讨论区管理页面（列表形式展示所有该教师创建的讨论），
     * 可以删除某个讨论
     * @param discussionId
     * @return
     * 成功删除：ResultVO:{code:0;msg:”删除成功” }
     * 删除失败：ResultVO:{code:1;msg:”删除失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/delete/{discussionId}")
    public ResultVO  delete(@PathVariable Integer discussionId){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 管理员在讨论区管理页面（列表形式展示系统内所有开设状态的讨论），
     * 点击某个讨论，可以查看详细信息，点击封禁按钮，（倒数5秒）再点击确认封禁，则完成封禁操作，
     * 该讨论权限变更为已封禁（可查看不可发帖状态）
     * @param discussionId
     * @return
     * 成功封禁：ResultVO:{code:0;msg:”封禁成功” }
     * 创建封禁：ResultVO:{code:1;msg:”封禁失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/prohibit/{discussionId}")
    public ResultVO  prohibit(@PathVariable Integer discussionId){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 管理员在讨论区管理页面（列表形式展示系统内所有开设状态的讨论），
     * 可以查询所有已封禁讨论，选择其中某个，点击解除封禁，（倒数5秒）点击确认解禁，则完成解禁，
     * 该讨论区权限变更为可回复（可查看可发帖）
     * @param discussionId
     * @return
     * 成功解禁：ResultVO:{code:0;msg:”解禁成功” }
     * 解禁失败：ResultVO:{code:1;msg:”解禁失败” }【msg中应包含详细错误信息】
     */
    @RequestMapping("/relieve/{discussionId}")
    public ResultVO  relieve(@PathVariable Integer discussionId){
        return new ResultVO(0,"");
    }

    /**
     * @author 朱翔鹏
     * 用户可以设置查询条件，检索所有开设中的讨论，
     * （只显示所参与的该课程下的讨论)
     * 【注意讨论是基于课程存在的，所有的讨论，只能在打开的课程页面进行参与】，
     * 列表显示结果，点击某讨论，则进入该讨论页面
     * @param courseId
     * @param
     * @return
     * List<DiscussionInfo>:返回所有符合条件的讨论；若查询结果为空，则list为null
     */
    @RequestMapping("/searchNew/{currPage}")
    public PageInfo<DiscussionDetail> searchNew(@PathVariable Integer currPage, @RequestBody DiscussionDetail discussionDetail){
        //最新
        PageInfo<DiscussionDetail> list1=discussionService.listNew(currPage, Define.PAGE_SIZE,discussionDetail);
        //System.out.println(discussionDetail.getDiscussionName());
        return list1;
    }
    @RequestMapping("/searchHot/{currPage}")
    public PageInfo<DiscussionDetail> searchHot(@PathVariable Integer currPage, @RequestBody DiscussionDetail discussionDetail){
        //最热
        PageInfo<DiscussionDetail> list1=discussionService.listHot(currPage, Define.PAGE_SIZE,discussionDetail);
        //System.out.println(discussionDetail.getDiscussionName());
        return list1;
    }

    /**
     * @author 朱翔鹏
     * 用户进入某讨论，显示讨论各项信息，以及回帖
     * @param discussionId
     * @return
     * DiscussionVO:{DiscussionInfo discussionInfo;List<DiscussRecord> list}
     * DiscussionInfo:该讨论信息，名称、创建教师、描述、关闭时间
     * List<DiscussRecord>:返回所有该讨论下所发的帖子；若查询结果为空，则list为null
     */
    @RequestMapping("/open/{discussionId}")
    public DiscussionVO open(@PathVariable Integer discussionId){
        return new DiscussionVO();
    }

    /**
     * @author 朱翔鹏
     * 在数据统计功能下，管理员可以查看系统内讨论区的热度实时排行榜
     * （后续开发考虑使用某种形象的echart来展现）；并选择是否将其发布在门户网站中
     * @param discussionInfo
     * @return
     */
    @RequestMapping("/discussionPopularity")
    public List<DiscussionStatistic>  discussionPopularity(@RequestBody DiscussionInfo discussionInfo){
        return null;
    }


}
