package com.gnw.Service.admin.googs;



import com.gnw.Pojo.admin.goods.Spec;
import com.gnw.entity.admin.PageResult;

import java.util.List;
import java.util.Map;

/**
 * spec业务逻辑层
 */
public interface SpecService {


    public List<Spec> findAll();


    public PageResult<Spec> findPage(int page, int size);


    public List<Spec> findList(Map<String, Object> searchMap);


    public PageResult<Spec> findPage(Map<String, Object> searchMap, int page, int size);


    public Spec findById(Integer id);

    public void add(Spec spec);


    public void update(Spec spec);


    public void delete(Integer id);

}
