package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RightPO;

public interface RottenRightDao {
    int deleteByPrimaryKey(String urid);

    int insert(RightPO record);

    int insertSelective(RightPO record);

    RightPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RightPO record);

    int updateByPrimaryKey(RightPO record);
}