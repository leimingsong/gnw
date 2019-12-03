package com.gnw.Controller.admin.order;


import com.gnw.Pojo.admin.order.ReturnOrder;
import com.gnw.Service.admin.order.ReturnOrderService;
import com.gnw.entity.admin.PageResult;
import com.gnw.entity.admin.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/returnOrder")
public class ReturnOrderController {
    @Autowired
    private ReturnOrderService returnOrderService;

    @GetMapping("/findAll")
    public List<ReturnOrder> findAll(){
        return returnOrderService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<ReturnOrder> findPage(int page, int size){
        return returnOrderService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<ReturnOrder> findList(@RequestBody Map<String,Object> searchMap){
        return returnOrderService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<ReturnOrder> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  returnOrderService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public ReturnOrder findById(Long id){
        return returnOrderService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody ReturnOrder returnOrder){
        returnOrderService.add(returnOrder);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody ReturnOrder returnOrder){
        returnOrderService.update(returnOrder);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Long id){
        returnOrderService.delete(id);
        return new Result();
    }

}
