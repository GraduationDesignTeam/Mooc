package com.mooc.mooc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.mooc.mapper.CourseInfoMapper;
import com.mooc.mooc.mapper.DiscussRecordMapper;
import com.mooc.mooc.mapper.DiscussionInfoMapper;
import com.mooc.mooc.mapper.UserInfoMapper;
import com.mooc.mooc.model.DiscussionDetail;
import com.mooc.mooc.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionServiceImpl implements DiscussionService {

    @Autowired
    private DiscussionInfoMapper discussionInfoMapper;

    @Autowired
    private DiscussRecordMapper discussRecordMapper;

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public PageInfo<DiscussionDetail> listNew(Integer currPage, Integer pageSize, DiscussionDetail discussionDetail) {
        //最新讨论排序
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, pageSize);
        return new PageInfo<>(discussionInfoMapper.queryAllNew(discussionDetail));
    }
    @Override
    public PageInfo<DiscussionDetail> listHot(Integer currPage, Integer pageSize, DiscussionDetail discussionDetail) {
        //最热讨论排序
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, pageSize);
        return new PageInfo<>(discussionInfoMapper.queryAllHot(discussionDetail));
    }

    @Override
    public DiscussionDetail open(Integer discussionId) {
        DiscussionDetail discussionDetail=discussionInfoMapper.selectByPrimaryKey(discussionId);
        discussionDetail.setRecordList(discussRecordMapper.selByDiscussionId(discussionId));
        discussionDetail.setRecordNum(discussionDetail.getRecordList().size());
        return discussionDetail;
    }
}
