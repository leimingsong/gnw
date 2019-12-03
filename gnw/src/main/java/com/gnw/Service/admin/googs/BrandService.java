package com.gnw.Service.admin.googs;


import com.gnw.Pojo.admin.goods.Brand;
import com.gnw.entity.admin.PageResult;

import java.util.List;
import java.util.Map;

public interface BrandService {


    public List<Brand> findAll();

    public PageResult<Brand> findPage(int page, int size);

    public List<Brand> findList(Map<String, Object> searchMap);


    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);

    public Brand findById(Integer id);

    public void add(Brand brand);

    public void update(Brand brand);

    public void delete(Integer id);
}
