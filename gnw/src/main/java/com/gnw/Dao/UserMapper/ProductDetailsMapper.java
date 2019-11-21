package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.ProductDetails;
import com.gnw.Pojo.UserPojo.ProductDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProductDetailsMapper extends BaseDao<ProductDetails> {
    int countByExample(ProductDetailsExample example);

    int deleteByExample(ProductDetailsExample example);

    int deleteByPrimaryKey(String prodDetailsId);

    int insert(ProductDetails record);

    int insertSelective(ProductDetails record);

    List<ProductDetails> selectByExample(ProductDetailsExample example);

    ProductDetails selectByPrimaryKey(String prodDetailsId);

    int updateByExampleSelective(@Param("record") ProductDetails record, @Param("example") ProductDetailsExample example);

    int updateByExample(@Param("record") ProductDetails record, @Param("example") ProductDetailsExample example);

    int updateByPrimaryKeySelective(ProductDetails record);

    int updateByPrimaryKey(ProductDetails record);
}