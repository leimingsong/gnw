package com.gnw.Service.admin.order;

import com.gnw.Pojo.admin.order.ReturnCause;
import com.gnw.entity.admin.PageResult;

import java.util.*;

/**
 * returnCause业务逻辑层
 */
public interface ReturnCauseService {


    public List<ReturnCause> findAll();


    public PageResult<ReturnCause> findPage(int page, int size);


    public List<ReturnCause> findList(Map<String, Object> searchMap);


    public PageResult<ReturnCause> findPage(Map<String, Object> searchMap, int page, int size);


    public ReturnCause findById(Integer id);

    public void add(ReturnCause returnCause);


    public void update(ReturnCause returnCause);


    public void delete(Integer id);

}
