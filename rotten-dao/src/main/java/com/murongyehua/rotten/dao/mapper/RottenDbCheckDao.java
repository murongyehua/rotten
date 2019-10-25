package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenDbCheck;

public interface RottenDbCheckDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenDbCheck record);

    int insertSelective(RottenDbCheck record);

    RottenDbCheck selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenDbCheck record);

    int updateByPrimaryKey(RottenDbCheck record);
}