package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.CaseClassPO;

public interface RottenCaseClassDao {
    int deleteByPrimaryKey(String urid);

    int insert(CaseClassPO record);

    int insertSelective(CaseClassPO record);

    CaseClassPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(CaseClassPO record);

    int updateByPrimaryKey(CaseClassPO record);
}