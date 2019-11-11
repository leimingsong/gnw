package com.gnw.Service.UserService.Impl;

import com.gnw.Base.BaseServiceImpl;
import com.gnw.Dao.UserMapper.RoleMapper;
import com.gnw.Pojo.UserPojo.Role;
import com.gnw.Pojo.UserPojo.RoleExample;
import com.gnw.Service.UserService.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {
    @Override
    public List<Role> getAll() {
        RoleExample example =new RoleExample();
        List<Role> roleList=new ArrayList<>();
        try {
            roleList=dao.selectByExample(example);
            return roleList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Role> getAllById(String id) {
        RoleExample example =new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Role> roleList=new ArrayList<>();
        try {
            roleList=dao.selectByExample(example);
            return roleList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
