package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenCase;

public interface RottenCaseDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenCase record);

    int insertSelective(RottenCase record);

    RottenCase selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenCase record);

    int updateByPrimaryKey(RottenCase record);
}