package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenProject;

public interface RottenProjectDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenProject record);

    int insertSelective(RottenProject record);

    RottenProject selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenProject record);

    int updateByPrimaryKey(RottenProject record);
}