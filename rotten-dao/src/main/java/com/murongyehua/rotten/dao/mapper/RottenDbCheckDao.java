package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.DbCheckPO;

public interface RottenDbCheckDao {
    int deleteByPrimaryKey(String urid);

    int insert(DbCheckPO record);

    int insertSelective(DbCheckPO record);

    DbCheckPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(DbCheckPO record);

    int updateByPrimaryKey(DbCheckPO record);
}