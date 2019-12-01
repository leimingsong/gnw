package com.gnw.Controller.admin;

import com.gnw.Pojo.admin.Brand;
import com.gnw.Service.admin.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class BrandController {
    @Autowired
    private BrandServiceImpl brandService;
@RequestMapping("/brand")
@ResponseBody
     public List<Brand> selectAll(){
         return brandService.selectAll();
     }

}
