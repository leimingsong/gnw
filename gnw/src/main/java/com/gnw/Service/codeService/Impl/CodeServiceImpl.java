package com.gnw.Service.codeService.Impl;

import com.gnw.Base.BaseServiceImpl;
import com.gnw.Dao.UserMapper.CheckcodeMapper;
import com.gnw.Pojo.UserPojo.Checkcode;
import com.gnw.Pojo.UserPojo.CheckcodeExample;
import com.gnw.Service.codeService.CodeService;
import com.gnw.Util.Result;
import com.gnw.Util.UsersUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CodeServiceImpl extends BaseServiceImpl<CheckcodeMapper, Checkcode> implements CodeService {
    @Override
    public Result addCode(Checkcode checkcode) {
        Result result;
        try {
            checkcode.setId(UsersUtil.uuid());
            int m=dao.insert(checkcode);
            if(m>0){
                result=Result.success();
            }else {
                result=Result.error();
            }
        }catch (Exception e){
            System.out.print(e);
            result= Result.error();
        }
        return result;
    }
    @Override
    public Checkcode getCodeById(String id) {
        Checkcode checkcode=new Checkcode();
        try {
            checkcode=dao.selectByPrimaryKey(id);
        }catch (Exception e){
            System.out.print(e);
        }
        return checkcode;
    }
}
