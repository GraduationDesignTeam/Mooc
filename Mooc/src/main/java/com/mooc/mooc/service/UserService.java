package com.mooc.mooc.service;

import com.mooc.mooc.model.UserDiscussion;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.vo.ResultVO;

import java.util.List;
import java.util.Map;

public interface UserService {

    Map<String,Object> login(UserInfo userInfo);

    List<UserDiscussion> getUserDiscussion();

    ResultVO add(UserInfo userInfo);

    ResultVO update(UserInfo userInfo);

    UserInfo checkSelfInfo(Integer userId);

    UserInfo checkOtherInfo(Integer targetId);
}
