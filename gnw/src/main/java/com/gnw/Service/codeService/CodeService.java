package com.gnw.Service.codeService;

import com.gnw.Pojo.UserPojo.Checkcode;
import com.gnw.Util.Result;

public interface CodeService {
    public Result addCode(Checkcode checkcode);
    public Checkcode getCodeById(String id);
}
