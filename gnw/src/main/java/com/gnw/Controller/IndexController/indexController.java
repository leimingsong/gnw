package com.gnw.Controller.IndexController;

import com.gnw.Util.Result;
import com.gnw.Service.indexService.IndexXXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
    @Autowired
    IndexXXXService indexXXXService;

    @GetMapping("/index")
    @ResponseBody
    public ModelAndView Index(){

        return new ModelAndView("/admin/main");
    }

    @GetMapping("/toRegister")
    public ModelAndView toRegister(){
        return new ModelAndView("/client/register");
    }

}
