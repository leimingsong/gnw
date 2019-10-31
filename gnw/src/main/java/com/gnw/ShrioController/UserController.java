package com.gnw.ShrioController;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController extends NoPermissionException{
    @RequiresPermissions("user:show")
    @ResponseBody
    @RequestMapping("/show")
    public String showUser() throws Exception{
        return "这是学生信息";
    }
    @RequiresPermissions("user:list")
    @ResponseBody
    @RequestMapping("/list")
    public String showUser2() throws Exception{
        return "这XXXX学生信息";
    }
}