package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.DiscussionInfoMapper;
import com.mooc.mooc.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionServiceImpl implements DiscussionService {

    @Autowired
    private DiscussionInfoMapper discussionInfoMapper;
}
