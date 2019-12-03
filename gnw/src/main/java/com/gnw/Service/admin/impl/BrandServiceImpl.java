package com.gnw.Service.admin.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gnw.Dao.admin.BrandMapper;
import com.gnw.Pojo.admin.Brand;
import com.gnw.Service.admin.BrandService;
import com.gnw.entity.admin.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;


import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    @Override
    public PageResult<Brand> findPage(int page, int size) {
        PageHelper.startPage(page,size);
        Page<Brand> pageResult=(Page<Brand>) brandMapper.selectAll();
        return new PageResult<Brand>(pageResult.getTotal(),pageResult.getResult());
    }

    @Override
    public List<Brand> findList(Map<String, Object> searchMap) {
        Example example = createExample(searchMap);
        return brandMapper.selectByExample(example);
    }

    @Override
    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size) {
        PageHelper.startPage(page,size);
        Example example = createExample(searchMap);
        Page<Brand> pageResult=(Page<Brand>) brandMapper.selectByExample(example);
        return new PageResult<>(pageResult.getTotal(),pageResult.getResult());
    }

    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Brand brand) {
        brandMapper.insertSelective(brand);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }


    private Example createExample(Map<String, Object> searchMap){
        Example example=new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();

        if(searchMap!=null){

            if(searchMap.get("name")!=null && !"".equals(searchMap.get("name")) ){
                criteria.andLike("name","%"+(String)searchMap.get("name")+"%");
            }
            if(searchMap.get("letter")!=null && !"".equals(searchMap.get("letter")) ){
                criteria.andEqualTo("letter",(String)searchMap.get("letter"));
            }
        }
        return example;
    }


}
