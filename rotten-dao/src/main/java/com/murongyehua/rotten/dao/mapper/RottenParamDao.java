package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenParam;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RottenParamDao {
    long countByExample(RottenParamExample example);

    int deleteByExample(RottenParamExample example);

    int deleteByPrimaryKey(String urid);

    int insert(RottenParam record);

    int insertSelective(RottenParam record);

    List<RottenParam> selectByExample(RottenParamExample example);

    RottenParam selectByPrimaryKey(String urid);

    int updateByExampleSelective(@Param("record") RottenParam record, @Param("example") RottenParamExample example);

    int updateByExample(@Param("record") RottenParam record, @Param("example") RottenParamExample example);

    int updateByPrimaryKeySelective(RottenParam record);

    int updateByPrimaryKey(RottenParam record);
}