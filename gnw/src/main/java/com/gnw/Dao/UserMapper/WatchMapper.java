package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.Watch;
import com.gnw.Pojo.UserPojo.WatchExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface WatchMapper extends BaseDao<Watch> {
    int countByExample(WatchExample example);

    int deleteByExample(WatchExample example);

    int deleteByPrimaryKey(String watchId);

    int insert(Watch record);

    int insertSelective(Watch record);

    List<Watch> selectByExample(WatchExample example);

    Watch selectByPrimaryKey(String watchId);

    int updateByExampleSelective(@Param("record") Watch record, @Param("example") WatchExample example);

    int updateByExample(@Param("record") Watch record, @Param("example") WatchExample example);

    int updateByPrimaryKeySelective(Watch record);

    int updateByPrimaryKey(Watch record);
}