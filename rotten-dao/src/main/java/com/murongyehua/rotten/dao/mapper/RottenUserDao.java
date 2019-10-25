package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenUser;

public interface RottenUserDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenUser record);

    int insertSelective(RottenUser record);

    RottenUser selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenUser record);

    int updateByPrimaryKey(RottenUser record);
}