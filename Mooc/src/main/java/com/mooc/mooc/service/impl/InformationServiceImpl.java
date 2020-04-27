package com.mooc.mooc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.mooc.mapper.CourseInfoMapper;
import com.mooc.mooc.mapper.InformationInfoMapper;
import com.mooc.mooc.model.InformationInfo;

import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.service.InformationService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationInfoMapper informationInfoMapper;

    @Override
    public List<InformationInfo> selAll() {
        return informationInfoMapper.selectAll();
    }

    @Override
    public PageInfo<InformationInfo> selBySenderId(Integer currPage, Integer pageSize, Integer senderid) {
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, pageSize);
        PageInfo<InformationInfo> informationPageInfo=new PageInfo<>(informationInfoMapper.selectBysenderid(senderid));
        return informationPageInfo;
    }

    @Override
    public PageInfo<InformationInfo> selByAddresserId(Integer currPage, Integer pageSize, Integer addresserid) {
        if(currPage==null){currPage=1;}
        PageHelper.startPage(currPage, pageSize);
        //System.out.println(addresserid);
       // System.out.println(informationInfoMapper.selectByAddresserid(addresserid));
        PageInfo<InformationInfo> informationPageInfo=new PageInfo<>(informationInfoMapper.selectByAddresserid(161250130));
        //System.out.println(informationPageInfo);
        return informationPageInfo;
    }



    @Override
    public ResultVO add(InformationInfo informationInfo) {
        informationInfoMapper.insert(informationInfo);
        return null;
    }

    @Override
    public ResultVO update(InformationInfo informationInfo) {
        informationInfoMapper.updateByPrimaryKey(informationInfo);
        return null;
    }

}
