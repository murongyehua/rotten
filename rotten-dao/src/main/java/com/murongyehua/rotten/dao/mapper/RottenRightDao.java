package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenRight;

public interface RottenRightDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenRight record);

    int insertSelective(RottenRight record);

    RottenRight selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenRight record);

    int updateByPrimaryKey(RottenRight record);
}