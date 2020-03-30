package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.DiscussRecordMapper;
import com.mooc.mooc.service.DiscussRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussRecordServiceImpl implements DiscussRecordService {

    @Autowired
    private DiscussRecordMapper discussRecordMapper;
}
