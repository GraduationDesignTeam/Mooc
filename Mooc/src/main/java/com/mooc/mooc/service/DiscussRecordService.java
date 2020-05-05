package com.mooc.mooc.service;

import com.mooc.mooc.model.DiscussRecord;
import com.mooc.mooc.vo.ResultVO;

public interface DiscussRecordService {

    ResultVO addRecord(DiscussRecord discussRecord);

    ResultVO updateRecord(DiscussRecord discussRecord);

    ResultVO deleteRecord(Integer discussRecordId);
}
