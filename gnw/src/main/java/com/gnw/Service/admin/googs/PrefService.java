package com.gnw.Service.admin.googs;



import com.gnw.Pojo.admin.goods.Pref;
import com.gnw.entity.admin.PageResult;

import java.util.List;
import java.util.Map;

/**
 * pref业务逻辑层
 */
public interface PrefService {


    public List<Pref> findAll();


    public PageResult<Pref> findPage(int page, int size);


    public List<Pref> findList(Map<String, Object> searchMap);


    public PageResult<Pref> findPage(Map<String, Object> searchMap, int page, int size);


    public Pref findById(Integer id);

    public void add(Pref pref);


    public void update(Pref pref);


    public void delete(Integer id);

}
