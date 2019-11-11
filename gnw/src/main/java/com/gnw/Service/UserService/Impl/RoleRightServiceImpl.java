package com.gnw.Service.UserService.Impl;

import com.gnw.Base.BaseServiceImpl;
import com.gnw.Dao.UserMapper.RoleRightMapper;
import com.gnw.Pojo.UserPojo.RoleRight;
import com.gnw.Pojo.UserPojo.RoleRightExample;
import com.gnw.Service.UserService.RoleRightService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleRightServiceImpl extends BaseServiceImpl<RoleRightMapper, RoleRight> implements RoleRightService {
    @Override
    public List<RoleRight> getAllByRoleId(String id) {
        List<RoleRight> roleRightList = new ArrayList<>();
        RoleRightExample example = new RoleRightExample();
        RoleRightExample.Criteria criteria= example.createCriteria();
        criteria.andRoleIdEqualTo(id);
        try {
            roleRightList=dao.selectByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
        return roleRightList;
    }
}
