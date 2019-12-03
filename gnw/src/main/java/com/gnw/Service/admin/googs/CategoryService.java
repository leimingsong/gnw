package com.gnw.Service.admin.googs;




import com.gnw.Pojo.admin.goods.Category;
import com.gnw.entity.admin.PageResult;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * category业务逻辑层
 *
 */

public interface CategoryService {


    public List<Category> findAll();


    public PageResult<Category> findPage(int page, int size);


    public List<Category> findList(Map<String, Object> searchMap);


    public PageResult<Category> findPage(Map<String, Object> searchMap, int page, int size);


    public Category findById(Integer id);

    public void add(Category category);


    public void update(Category category);


    public void delete(Integer id);

}
