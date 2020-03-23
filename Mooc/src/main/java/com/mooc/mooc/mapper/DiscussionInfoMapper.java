package com.mooc.mooc.mapper;

import com.mooc.mooc.model.DiscussionInfo;
import java.util.List;

public interface DiscussionInfoMapper {
    int deleteByPrimaryKey(Integer discussionId);

    int insert(DiscussionInfo record);

    DiscussionInfo selectByPrimaryKey(Integer discussionId);

    List<DiscussionInfo> selectAll();

    int updateByPrimaryKey(DiscussionInfo record);
}