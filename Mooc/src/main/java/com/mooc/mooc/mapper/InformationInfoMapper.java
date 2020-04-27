package com.mooc.mooc.mapper;

import com.mooc.mooc.model.InformationInfo;
import java.util.List;

public interface InformationInfoMapper {
    int deleteByPrimaryKey(Integer informationId);

    int insert(InformationInfo record);

    InformationInfo selectByPrimaryKey(Integer informationId);

    List<InformationInfo> selectAll();

    List<InformationInfo> selectBysenderid(Integer senderid);

    List<InformationInfo> selectByAddresserid(Integer addresserid);

    int updateByPrimaryKey(InformationInfo record);
}