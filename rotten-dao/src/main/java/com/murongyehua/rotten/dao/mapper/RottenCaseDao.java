package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.CasePO;

public interface RottenCaseDao {
    int deleteByPrimaryKey(String urid);

    int insert(CasePO record);

    int insertSelective(CasePO record);

    CasePO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(CasePO record);

    int updateByPrimaryKey(CasePO record);
}