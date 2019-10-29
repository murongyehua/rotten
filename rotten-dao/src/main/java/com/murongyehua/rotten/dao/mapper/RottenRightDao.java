package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RightPO;

import java.util.List;

public interface RottenRightDao {
    int deleteByPrimaryKey(String urid);

    int insert(RightPO record);

    int insertSelective(RightPO record);

    RightPO selectByPrimaryKey(String urid);

    List<RightPO> selectBySelective(RightPO rightPO);

    int updateByPrimaryKeySelective(RightPO record);

    int updateByPrimaryKey(RightPO record);
}