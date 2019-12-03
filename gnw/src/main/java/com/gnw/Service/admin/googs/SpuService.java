package com.gnw.Service.admin.googs;




import com.gnw.Pojo.admin.goods.Spu;
import com.gnw.entity.admin.PageResult;

import java.util.List;
import java.util.Map;

/**
 * spu业务逻辑层
 */
public interface SpuService {


    public List<Spu> findAll();


    public PageResult<Spu> findPage(int page, int size);


    public List<Spu> findList(Map<String, Object> searchMap);


    public PageResult<Spu> findPage(Map<String, Object> searchMap, int page, int size);


    public Spu findById(String id);

    public void add(Spu spu);


    public void update(Spu spu);


    public void delete(String id);

}
