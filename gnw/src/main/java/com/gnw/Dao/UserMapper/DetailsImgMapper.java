package com.gnw.Dao.UserMapper;

import com.gnw.Base.BaseDao;
import com.gnw.Pojo.UserPojo.DetailsImg;
import com.gnw.Pojo.UserPojo.DetailsImgExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 详情页图片表，用来保存图片的主要信息
 */
@Mapper
public interface DetailsImgMapper extends BaseDao<DetailsImg> {
    int countByExample(DetailsImgExample example);

    int deleteByExample(DetailsImgExample example);

    int deleteByPrimaryKey(String detaImgId);

    int insert(DetailsImg record);

    int insertSelective(DetailsImg record);

    List<DetailsImg> selectByExample(DetailsImgExample example);

    DetailsImg selectByPrimaryKey(String detaImgId);

    int updateByExampleSelective(@Param("record") DetailsImg record, @Param("example") DetailsImgExample example);

    int updateByExample(@Param("record") DetailsImg record, @Param("example") DetailsImgExample example);

    int updateByPrimaryKeySelective(DetailsImg record);

    int updateByPrimaryKey(DetailsImg record);
}