package com.gnw.Controller.IndexController;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.api.R;
import com.gnw.Pojo.UserPojo.Checkcode;
import com.gnw.Service.codeService.Impl.CodeServiceImpl;
import com.gnw.Util.Result;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Random;

/*
* 通过榛子云实现手机验证码的接受
* */
@Controller
public class PhoneCodeController {

    //短信平台相关参数
    //这个不用改
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    //榛子云系统上获取
    private String appId = "103405";
    private String appSecret = "ccc7e599-790f-4c71-84df-85624df0dfd0";

    @Autowired private CodeServiceImpl codeService;

    @RequestMapping(value = "/postCode", method = RequestMethod.GET)
    @ResponseBody
    public Result getCode(@RequestParam("phoneNumber") String phoneNumber, HttpSession httpSession){
        Result result;
        try {
            JSONObject json = null;
            //随机生成验证码
            String code = String.valueOf(new Random().nextInt(999999));
            //将验证码通过榛子云接口发送至手机
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            String message = client.send(phoneNumber, "您的验证码为:" + code + "，该码有效期为5分钟，该码只能使用一次!");

            json = JSONObject.parseObject(message);
            if (json.getIntValue("code")!=0){//发送短信失败
                return  result=Result.error("发送短信失败");
            }
            //将验证码存到session中,同时存入创建时间
            //以json存放，这里使用的是阿里的fastjson
            json = new JSONObject();
            json.put("phone",phoneNumber);
            json.put("code",code);
            json.put("createTime",System.currentTimeMillis());
            // 将认证码存入SESSION
            httpSession.setAttribute("phoneCode",json);
            Checkcode checkcode = new Checkcode();
            checkcode.setCode(code);
            checkcode.setTel(phoneNumber);
            checkcode.setCreateTime(new Date());
            codeService.insert(checkcode);
            checkcode.setCode(null);
            return result=Result.success(checkcode);
        } catch (Exception e) {
            e.printStackTrace();
            return result=Result.error("发送短信失败");
        }
    }
    @RequestMapping(value = "/checkCode", method = RequestMethod.GET)
    @ResponseBody
    public Result checkCode(Checkcode checkcode){
        Result result;
        Checkcode checkcode1=codeService.getCodeById(checkcode.getId());
        if(checkcode.getCode()==checkcode1.getCode()){
            result=Result.success();
        }else {
            result=Result.error();
        }
        return result;
    }
}
