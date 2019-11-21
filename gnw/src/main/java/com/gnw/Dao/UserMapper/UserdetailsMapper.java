package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.Userdetails;
import com.gnw.Pojo.UserPojo.UserdetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserdetailsMapper extends BaseDao<Userdetails>{
    int countByExample(UserdetailsExample example);

    int deleteByExample(UserdetailsExample example);

    int deleteByPrimaryKey(String udetailsId);

    int insert(Userdetails record);

    int insertSelective(Userdetails record);

    List<Userdetails> selectByExample(UserdetailsExample example);

    Userdetails selectByPrimaryKey(String udetailsId);

    int updateByExampleSelective(@Param("record") Userdetails record, @Param("example") UserdetailsExample example);

    int updateByExample(@Param("record") Userdetails record, @Param("example") UserdetailsExample example);

    int updateByPrimaryKeySelective(Userdetails record);

    int updateByPrimaryKey(Userdetails record);
}