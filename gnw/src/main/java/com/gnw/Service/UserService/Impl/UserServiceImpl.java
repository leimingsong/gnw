package com.gnw.Service.UserService.Impl;

import com.gnw.Base.BaseServiceImpl;
import com.gnw.Dao.UserMapper.UserMapper;
import com.gnw.Pojo.UserPojo.User;
import com.gnw.Pojo.UserPojo.UserExample;
import com.gnw.Service.UserService.UserService;
import com.gnw.Util.GenstrUtil;
import com.gnw.Util.MD5;
import com.gnw.Util.Result;
import com.gnw.Util.UsersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result getUserMsg(String account) throws Exception{
        Result result=null;
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        List<User> userList=new ArrayList<>();
        try {
            userList=userMapper.selectByExample(userExample);
            if(userList.size()>0){
                result=Result.success(userList.get(0));
            }else {
                result=Result.error("用户不存在");
            }
        }catch (Exception e){
            result=Result.error("查询出现异常");
        }
        return result;
    }

    @Override
    public Result addUser(User user) throws Exception {
        Result result= null;
        /**
         * 获取加密盐 然后加密密码
         */
        String salt = GenstrUtil.generateString(4);
        user.setId(UsersUtil.uuid());
        user.setSalt(salt);
        user.setPassword(MD5.md5Password(user.getPassword(),salt,1));
        try {
            int falg=userMapper.insert(user);
            if(falg==1)result=Result.success();
            else result=Result.error("用户注册失败");
        }catch (Exception e){
            result=Result.error("用户注册出现异常");
        }
        return result;
    }
}
