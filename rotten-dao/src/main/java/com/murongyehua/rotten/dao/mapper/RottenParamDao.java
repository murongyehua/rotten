package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenParam;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RottenParamDao {

    int deleteByPrimaryKey(String urid);

    int insert(RottenParam record);

    int insertSelective(RottenParam record);

    RottenParam selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenParam record);

    int updateByPrimaryKey(RottenParam record);
}