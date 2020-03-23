package com.mooc.mooc.mapper;

import com.mooc.mooc.model.InformationInfo;
import java.util.List;

public interface InformationInfoMapper {
    int deleteByPrimaryKey(Integer informationId);

    int insert(InformationInfo record);

    InformationInfo selectByPrimaryKey(Integer informationId);

    List<InformationInfo> selectAll();

    int updateByPrimaryKey(InformationInfo record);
}