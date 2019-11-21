package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.OrderTab;
import com.gnw.Pojo.UserPojo.OrderTabExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderTabMapper extends BaseDao<OrderTab> {
    int countByExample(OrderTabExample example);

    int deleteByExample(OrderTabExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderTab record);

    int insertSelective(OrderTab record);

    List<OrderTab> selectByExample(OrderTabExample example);

    OrderTab selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderTab record, @Param("example") OrderTabExample example);

    int updateByExample(@Param("record") OrderTab record, @Param("example") OrderTabExample example);

    int updateByPrimaryKeySelective(OrderTab record);

    int updateByPrimaryKey(OrderTab record);
}