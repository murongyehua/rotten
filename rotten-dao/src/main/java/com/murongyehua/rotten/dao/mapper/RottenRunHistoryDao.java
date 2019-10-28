package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.RunHistoryPO;

public interface RottenRunHistoryDao {
    int deleteByPrimaryKey(String urid);

    int insert(RunHistoryPO record);

    int insertSelective(RunHistoryPO record);

    RunHistoryPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(RunHistoryPO record);

    int updateByPrimaryKey(RunHistoryPO record);
}