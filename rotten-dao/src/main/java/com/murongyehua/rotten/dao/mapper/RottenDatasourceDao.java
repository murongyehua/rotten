package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.DatasourcePO;

public interface RottenDatasourceDao {
    int deleteByPrimaryKey(String urid);

    int insert(DatasourcePO record);

    int insertSelective(DatasourcePO record);

    DatasourcePO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(DatasourcePO record);

    int updateByPrimaryKey(DatasourcePO record);
}