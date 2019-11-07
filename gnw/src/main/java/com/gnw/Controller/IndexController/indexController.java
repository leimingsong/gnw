package com.gnw.Controller.IndexController;

import com.gnw.Common.Result;
import com.gnw.Pojo.testpojo.Menu;
import com.gnw.Service.indexService.IndexXXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {
    @Autowired
    IndexXXXService indexXXXService;


    @RequestMapping(value = "/addtest" ,method = RequestMethod.POST)
    @ResponseBody
    public Result addtest(Menu menu)throws Exception{
        return indexXXXService.addTest(menu);
    }
    @GetMapping("/index")
    public ModelAndView Index(){
        return new ModelAndView("/index");
    }

}
