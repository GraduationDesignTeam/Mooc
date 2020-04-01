package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.UserDiscussionMapper;
import com.mooc.mooc.mapper.UserInfoMapper;
import com.mooc.mooc.model.UserDiscussion;
import com.mooc.mooc.model.UserInfo;
import com.mooc.mooc.service.UserService;
import com.mooc.mooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserDiscussionMapper userDiscussionMapper;

    /**
     * @author 朱翔鹏
     * 开发中临时用于登录
     * @param userInfo
     * @return map: code: 0-成功，1-用户名错误,2-密码错误; Object:userInfo对象
     */
    @Override
    public Map<String,Object> login(UserInfo userInfo) {
        Map<String,Object> map=new HashMap<>();
        int code=0;
        UserInfo userInfo1=userInfoMapper.selectByUsername(userInfo.getUserName());
        if(userInfo1==null){//用户名错
            code=1;
        }else{
            if(!userInfo1.getUserPassword().equals(userInfo.getUserPassword())){//密码错误
                code=2;
            }
        }
        map.put("code",code);
        map.put("user",userInfo1);
        return map;
    }

    @Override
    public List<UserDiscussion> getUserDiscussion() {
        return userDiscussionMapper.selectAll();
    }

    /**
     * @author 朱翔鹏
     * 用户新增时（新用户注册时），将用户填写的各项信息保存到数据库中
     * 1.	字段合法性验证
     * 2.	数据库合法性验证，验证user是否已存在
     * 3.	若验证失败则返回false和错误信息
     * @param userInfo
     * @return
     * 新增成功：ResultVO{code:0,msg:”新增成功”}
     * 验证到用户名重复：ResultVO{code:1,msg:”用户已存在”}
     * 验证到非法字段：ResultVO{code:2,msg:”用户名不能为空”}；3，“密码不能为空”；
     */
    @Override
    public ResultVO add(UserInfo userInfo) {
        ResultVO resultVO=new ResultVO();
        List<UserInfo> list=userInfoMapper.selectAll();
        for(int i=0;i<list.size();i++){
            if(userInfo.getUserName().equals("")||userInfo.getUserName().equals(null)){
                resultVO.setCode(2);
                resultVO.setMsg("用户名不能为空");
                return resultVO;
            }else if(userInfo.getUserPassword().equals("")||userInfo.getUserPassword().equals(null)){
                resultVO.setCode(3);
                resultVO.setMsg("密码不能为空");
                return resultVO;
            }else if(userInfo.getUserName().equals(list.get(i).getUserName())){
                resultVO.setCode(1);
                resultVO.setMsg("用户已存在");
                return resultVO;
            }
        }
        userInfo.setRegisterTime(new Date());
        userInfoMapper.insert(userInfo);
        resultVO.setCode(0);
        resultVO.setMsg("新增成功");
        return resultVO;
    }

    /**
     * @author 朱翔鹏
     * 用户可以修改个人信息，根据修改后的各项信息更新数据库
     * 1.	字段合法性验证
     * 2.	若验证失败则返回false和错误信息
     * @param userInfo
     * @return
     * 修改成功：ResultVO{code:0,msg:”修改成功”}
     * 验证到非法字段：ResultVO{code:2,msg:”用户名不能为空”}；3，“密码不能为空”；
     */
    @Override
    public ResultVO update(UserInfo userInfo) {
        ResultVO resultVO=new ResultVO();
        List<UserInfo> list=userInfoMapper.selectAll();
        for(int i=0;i<list.size();i++){
            if(userInfo.getUserName().equals("")||userInfo.getUserName().equals(null)){
                resultVO.setCode(2);
                resultVO.setMsg("用户名不能为空");
                return resultVO;
            }else if(userInfo.getUserPassword().equals("")||userInfo.getUserPassword().equals(null)){
                resultVO.setCode(3);
                resultVO.setMsg("密码不能为空");
                return resultVO;
            }
        }
        userInfoMapper.updateByPrimaryKey(userInfo);
        resultVO.setCode(0);
        resultVO.setMsg("修改成功");
        return resultVO;
    }

    /**
     * @author 朱翔鹏
     * 返回用户自己的信息
     * @param userId
     * @return
     */
    @Override
    public UserInfo checkSelfInfo(Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    /**
     * @author 朱翔鹏
     * 返回所查看的其它用户的信息
     * @param targetId
     * @return
     * 用户的姓名，电话号码，密码等信息应该对其他人保密
     */
    @Override
    public UserInfo checkOtherInfo(Integer targetId) {
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(targetId);
        userInfo.setPhone(null);
        userInfo.setName(null);
        userInfo.setUserPassword(null);
        return userInfo;
    }
}
