package com.gnw.Controller.admin.googs;


import com.gnw.Pojo.admin.goods.Pref;
import com.gnw.Service.admin.googs.PrefService;
import com.gnw.entity.admin.PageResult;
import com.gnw.entity.admin.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pref")
public class PrefController {

    @Autowired
    private PrefService prefService;

    @GetMapping("/findAll")
    public List<Pref> findAll(){
        return prefService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Pref> findPage(int page, int size){
        return prefService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Pref> findList(@RequestBody Map<String,Object> searchMap){
        return prefService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Pref> findPage(@RequestBody Map<String,Object> searchMap, int page, int size){
        return  prefService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Pref findById(Integer id){
        return prefService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Pref pref){
        prefService.add(pref);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Pref pref){
        prefService.update(pref);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Integer id){
        prefService.delete(id);
        return new Result();
    }

}
