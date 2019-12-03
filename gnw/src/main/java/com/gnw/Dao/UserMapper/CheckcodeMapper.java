package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.Checkcode;
import com.gnw.Pojo.UserPojo.CheckcodeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CheckcodeMapper extends BaseDao<Checkcode> {
    int countByExample(CheckcodeExample example);

    int deleteByExample(CheckcodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Checkcode record);

    int insertSelective(Checkcode record);

    List<Checkcode> selectByExample(CheckcodeExample example);

    Checkcode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Checkcode record, @Param("example") CheckcodeExample example);

    int updateByExample(@Param("record") Checkcode record, @Param("example") CheckcodeExample example);

    int updateByPrimaryKeySelective(Checkcode record);

    int updateByPrimaryKey(Checkcode record);
}