package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.UserPO;

import java.util.List;

public interface RottenUserDao {
    int deleteByPrimaryKey(String urid);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(String urid);

    List<UserPO> selectBySelective(UserPO userPO);

    int isUserExist(UserPO userPO);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}