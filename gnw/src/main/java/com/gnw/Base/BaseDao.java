package com.gnw.Base;

import java.util.List;

/**
 * 基础数据dao层接口
 * @param <T>
 */
public interface BaseDao<T> {
    int deleteByPrimaryKey(String id);
    int insert(T record);
    int insertSelective(T record);
    T selectByPrimaryKey(String id);
    List<T> selectAll(T record);
    int updateByPrimaryKeySelective(T record);
    int updateByPrimaryKey(T record);
    int batchDelete(T record);
}
