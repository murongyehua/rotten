package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RottenCaseClass;

public interface RottenCaseClassDao {
    int deleteByPrimaryKey(String urid);

    int insert(RottenCaseClass record);

    int insertSelective(RottenCaseClass record);

    RottenCaseClass selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RottenCaseClass record);

    int updateByPrimaryKey(RottenCaseClass record);
}