package com.gnw.Controller.admin;


import com.gnw.Pojo.admin.Brand;
import com.gnw.Service.admin.BrandService;
;
import com.gnw.entity.admin.PageResult;
import com.gnw.entity.admin.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BrandController {
@Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }


    @GetMapping("/findPage")
    public PageResult<Brand> findPage(int page, int size){
        return  brandService.findPage(page,size);
    }


    @PostMapping("/findList")
    public List<Brand> findList( @RequestBody Map searchMap){
        return brandService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Brand>  findPage(@RequestBody Map searchMap,int page,int size ){
        return brandService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Brand findById(Integer id){
        return brandService.findById(id);
    }

    @PostMapping("/add")
    public Result add(@RequestBody  Brand brand){
        brandService.add(brand);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody  Brand brand){
        brandService.update(brand);
        return new Result();
    }

    @GetMapping("delete")
    public Result delete(Integer id){
        brandService.delete(id);
        return new Result();
    }

}
