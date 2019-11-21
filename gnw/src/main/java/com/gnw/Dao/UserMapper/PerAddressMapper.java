package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.PerAddress;
import com.gnw.Pojo.UserPojo.PerAddressExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PerAddressMapper extends BaseDao<PerAddress> {
    int countByExample(PerAddressExample example);

    int deleteByExample(PerAddressExample example);

    int deleteByPrimaryKey(String perAddressId);

    int insert(PerAddress record);

    int insertSelective(PerAddress record);

    List<PerAddress> selectByExample(PerAddressExample example);

    PerAddress selectByPrimaryKey(String perAddressId);

    int updateByExampleSelective(@Param("record") PerAddress record, @Param("example") PerAddressExample example);

    int updateByExample(@Param("record") PerAddress record, @Param("example") PerAddressExample example);

    int updateByPrimaryKeySelective(PerAddress record);

    int updateByPrimaryKey(PerAddress record);
}