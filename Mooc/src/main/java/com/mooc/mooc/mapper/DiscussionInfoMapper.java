package com.mooc.mooc.mapper;

import com.mooc.mooc.model.*;

import java.util.List;

public interface DiscussionInfoMapper {
    int deleteByPrimaryKey(Integer discussionId);

    int insert(DiscussionInfo record);

    DiscussionDetail selectByPrimaryKey(Integer discussionId);

    List<DiscussionInfo> selectAll();

    int updateByPrimaryKey(DiscussionInfo record);

    List<DiscussionDetail> queryAllNew(DiscussionDetail discussionDetail);

    List<DiscussionDetail> queryAllHot(DiscussionDetail discussionDetail);

    List<MajorStatistic> queryMajorSum(Integer year);

    List<DiscussionStatistic> queryDiscussionSum(Integer year);
}