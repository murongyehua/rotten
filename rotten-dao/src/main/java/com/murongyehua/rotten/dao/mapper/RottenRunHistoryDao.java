package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenRunHistory;

public interface RottenRunHistoryDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenRunHistory record);

    int insertSelective(RottenRunHistory record);

    RottenRunHistory selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenRunHistory record);

    int updateByPrimaryKey(RottenRunHistory record);
}