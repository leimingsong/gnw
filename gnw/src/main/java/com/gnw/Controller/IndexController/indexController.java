package com.gnw.Controller.IndexController;

import com.gnw.Common.Result;
import com.gnw.Pojo.testpojo.Menu;
import com.gnw.Service.indexService.IndexXXXService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @Autowired
    IndexXXXService indexXXXService;


    @RequestMapping(value = "/addtest" ,method = RequestMethod.POST)
    @ResponseBody
    public Result addtest(Menu menu)throws Exception{
        return indexXXXService.addTest(menu);
    }
}
