package com.gnw.Service.UserService.Impl;

import com.gnw.Base.BaseServiceImpl;
import com.gnw.Dao.UserMapper.PerssionMapper;
import com.gnw.Pojo.UserPojo.Perssion;
import com.gnw.Pojo.UserPojo.PerssionExample;
import com.gnw.Service.UserService.PerssionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerssionServiceImpl extends BaseServiceImpl<PerssionMapper, Perssion> implements PerssionService {
    @Override
    public List<Perssion> getAllById(String id) {
        PerssionExample example =new PerssionExample();
        PerssionExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Perssion> perssionList = new ArrayList<>();
        try {
            perssionList=dao.selectByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
        return perssionList;
    }
}
