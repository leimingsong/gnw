package com.gnw.Controller.admin.lbt;


import com.gnw.Pojo.admin.lbt.TbAd;
import com.gnw.Service.admin.lbt.TbAdService;
import com.gnw.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/tbAd"})
public class TbAdController {

    @Autowired
    private TbAdService tbAdService;

    /*
    * 查询所有广告
    * */
    @RequestMapping(value = {"/queryAllAds"})
    //@ResponseBody
    public String queryAllAds(Model model){
        List<TbAd> tbAds = tbAdService.queryAllAds();
        model.addAttribute("tbAds",tbAds);
        return "/client/index";
    }


}
