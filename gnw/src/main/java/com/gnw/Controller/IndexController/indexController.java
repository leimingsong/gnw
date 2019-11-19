package com.gnw.Controller.IndexController;

import com.gnw.Util.Result;
import com.gnw.Service.indexService.IndexXXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {
    @Autowired
    IndexXXXService indexXXXService;

    @GetMapping("/index")
    public ModelAndView Index(){
        return new ModelAndView("/index");
    }
    @GetMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("/admin/main");
    }
}
