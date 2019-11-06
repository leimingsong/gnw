package com.gnw.Service.indexService.Impl;

import com.gnw.Common.Result;
import com.gnw.MapperImpl.testmapper.MenuMapper;
import com.gnw.Pojo.testpojo.Menu;
import com.gnw.Pojo.testpojo.MenuExample;
import com.gnw.Service.indexService.IndexXXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexXXXServiceImpl implements IndexXXXService {
    @Autowired private MenuMapper menuMapper;
    @Override
    public Result addTest(Menu menu) throws Exception {
        Result result = null;
        try {
            int i=menuMapper.insert(menu);
            if(i==1)
                result=Result.success(i);
            else {
                result=Result.error();
            }
        }catch (Exception e){
            result=Result.error(null,"异常");
            System.out.print(e);
        }
        return result;
    }
}
