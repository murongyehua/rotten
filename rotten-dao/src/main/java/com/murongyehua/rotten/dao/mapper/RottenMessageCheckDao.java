package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenMessageCheck;

public interface RottenMessageCheckDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenMessageCheck record);

    int insertSelective(RottenMessageCheck record);

    RottenMessageCheck selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenMessageCheck record);

    int updateByPrimaryKey(RottenMessageCheck record);
}