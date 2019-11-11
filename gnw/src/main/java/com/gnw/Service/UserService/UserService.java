package com.gnw.Service.UserService;

import com.gnw.Pojo.UserPojo.User;
import com.gnw.Util.Result;

public interface UserService {
    public Result getUserMsg(String account)throws Exception;
    public Result addUser(User user)throws Exception;
}
