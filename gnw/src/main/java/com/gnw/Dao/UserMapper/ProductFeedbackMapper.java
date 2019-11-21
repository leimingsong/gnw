package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.ProductFeedback;
import com.gnw.Pojo.UserPojo.ProductFeedbackExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProductFeedbackMapper extends BaseDao<ProductFeedback> {
    int countByExample(ProductFeedbackExample example);

    int deleteByExample(ProductFeedbackExample example);

    int deleteByPrimaryKey(String prodFeedbackId);

    int insert(ProductFeedback record);

    int insertSelective(ProductFeedback record);

    List<ProductFeedback> selectByExample(ProductFeedbackExample example);

    ProductFeedback selectByPrimaryKey(String prodFeedbackId);

    int updateByExampleSelective(@Param("record") ProductFeedback record, @Param("example") ProductFeedbackExample example);

    int updateByExample(@Param("record") ProductFeedback record, @Param("example") ProductFeedbackExample example);

    int updateByPrimaryKeySelective(ProductFeedback record);

    int updateByPrimaryKey(ProductFeedback record);
}