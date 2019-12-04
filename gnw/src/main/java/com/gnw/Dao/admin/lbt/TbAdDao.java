package com.gnw.Dao.admin.lbt;

import com.gnw.Pojo.admin.lbt.TbAd;
import com.gnw.Pojo.admin.lbt.TbAdExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbAdDao {

    long countByExample(TbAdExample example);

    int deleteByExample(TbAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAd record);

    int insertSelective(TbAd record);

    List<TbAd> selectByExample(TbAdExample example);

    TbAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByExample(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByPrimaryKeySelective(TbAd record);

    int updateByPrimaryKey(TbAd record);

}