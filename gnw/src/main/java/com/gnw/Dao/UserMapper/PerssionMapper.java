package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.Perssion;
import com.gnw.Pojo.UserPojo.PerssionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PerssionMapper extends BaseDao<Perssion> {
    int countByExample(PerssionExample example);

    int deleteByExample(PerssionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Perssion record);

    int insertSelective(Perssion record);

    List<Perssion> selectByExample(PerssionExample example);

    Perssion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Perssion record, @Param("example") PerssionExample example);

    int updateByExample(@Param("record") Perssion record, @Param("example") PerssionExample example);

    int updateByPrimaryKeySelective(Perssion record);

    int updateByPrimaryKey(Perssion record);
}