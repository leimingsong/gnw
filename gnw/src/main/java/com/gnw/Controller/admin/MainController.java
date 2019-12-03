package com.gnw.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
    @RequestMapping("/gobrand")
    public String goBrand(){
        return "/admin/brand";
    }
    @RequestMapping("/main")
    public String goMain(){
        return "/admin/main";
    }
}
