package com.gnw.ShrioController;

import com.gnw.Common.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeIndexController {

    @GetMapping("/login")
    public String defaultLogin() {
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Result result=null;
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            result=Result.error("未知账户");
        } catch (IncorrectCredentialsException ice) {
            result=Result.error("密码不正确");
        } catch (LockedAccountException lae) {
            result=Result.error("账户已锁定");
        } catch (ExcessiveAttemptsException eae) {
            result=Result.error("用户名或密码错误次数过多");
        } catch (AuthenticationException ae) {
            result=Result.error("用户名或密码不正确");
        }
        if (subject.isAuthenticated()) {
            result=Result.success(username,"登录成功");
        } else {
            token.clear();
            result=Result.error("登录失败");
        }
        return result;
    }
}
