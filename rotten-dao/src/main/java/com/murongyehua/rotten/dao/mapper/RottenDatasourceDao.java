package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenDatasource;

public interface RottenDatasourceDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenDatasource record);

    int insertSelective(RottenDatasource record);

    RottenDatasource selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenDatasource record);

    int updateByPrimaryKey(RottenDatasource record);
}