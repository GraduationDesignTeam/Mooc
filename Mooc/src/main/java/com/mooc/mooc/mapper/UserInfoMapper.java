package com.mooc.mooc.mapper;

import com.mooc.mooc.model.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    List<UserInfo> selectAll();
}