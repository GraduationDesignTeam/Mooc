package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.DiscussRecordMapper;
import com.mooc.mooc.model.DiscussRecord;
import com.mooc.mooc.service.DiscussRecordService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DiscussRecordServiceImpl implements DiscussRecordService {

    @Autowired
    private DiscussRecordMapper discussRecordMapper;

    /**
     * @author 朱翔鹏
     * 学生进入某个讨论，点击发帖，编辑帖子内容，点击发布
     * 点击某帖下的回复按钮，编辑回帖内容，点击发布，该帖帖头显示“回复xx楼”
     * @param discussRecord
     * @return
     * 成功发帖：ResultVO:{code:0;msg:”发帖成功” }
     * 发帖失败：ResultVO:{code:1;msg:”发帖失败” }【msg中应包含详细错误信息】
     */
    @Override
    public ResultVO addRecord(DiscussRecord discussRecord) {
        ResultVO resultVO=new ResultVO();
        discussRecordMapper.insert(discussRecord);
        resultVO.setCode(0);
        resultVO.setMsg("发帖成功");
        return resultVO;
    }

    /**
     * @author 朱翔鹏
     * 学生进入某个讨论，点击某个自己发的帖，可以编辑帖子内容，点击确认
     * @param discussRecord
     * @return
     * 成功改帖：ResultVO:{code:0;msg:”修改成功” }
     * 改帖失败：ResultVO:{code:1;msg:”修改失败” }【msg中应包含详细错误信息】
     */
    @Override
    public ResultVO updateRecord(DiscussRecord discussRecord) {
        discussRecord.setLastUpdateTime(new Date());
        discussRecord.setDeleteTime(null);
        discussRecordMapper.updateByPrimaryKey(discussRecord);
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("修改成功");
        return resultVO;
    }

    /**
     * @author 朱翔鹏
     * 学生进入某个讨论，点击某个自己发的帖，可以删除该贴
     * 助教进入某个讨论，点击某帖，可以删除该贴（前提是该讨论管理助教）
     * 教师进入某个讨论，点击某帖，可以删除该贴（前提是该讨论管理教师）
     * 管理员进入某个讨论，点击某帖，可以删除该贴
     * @param discussRecordId
     * @return
     * 成功删帖：ResultVO:{code:0;msg:”删帖成功” }
     * 删帖失败：ResultVO:{code:1;msg:”删帖失败” }【msg中应包含详细错误信息】
     */
    @Override
    public ResultVO deleteRecord(Integer discussRecordId) {
        DiscussRecord discussRecord=discussRecordMapper.selectByPrimaryKey(discussRecordId);
        discussRecord.setDiscussContent("");
        discussRecord.setLastUpdateTime(new Date());
        discussRecord.setDeleteTime(new Date());
        ResultVO resultVO=new ResultVO();
        discussRecordMapper.updateByPrimaryKey(discussRecord);
        resultVO.setCode(0);
        resultVO.setMsg("删帖成功");
        return resultVO;
    }
}
