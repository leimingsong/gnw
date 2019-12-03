package com.gnw.Service.admin.googs;



import com.gnw.Pojo.admin.goods.Album;
import com.gnw.entity.admin.PageResult;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * album业务逻辑层
 */
public interface AlbumService {


    public List<Album> findAll();


    public PageResult<Album> findPage(int page, int size);


    public List<Album> findList(Map<String, Object> searchMap);


    public PageResult<Album> findPage(Map<String, Object> searchMap, int page, int size);


    public Album findById(Long id);

    public void add(Album album);


    public void update(Album album);


    public void delete(Long id);

}
