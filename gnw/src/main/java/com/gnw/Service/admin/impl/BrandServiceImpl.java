package com.gnw.Service.admin.impl;

import com.gnw.Dao.admin.BrandMapper;
import com.gnw.Pojo.admin.Brand;
import com.gnw.Service.admin.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> selectAll() {
        return brandMapper.selectAll();
    }
}
