package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.ProjectPO;

public interface RottenProjectDao {
    int deleteByPrimaryKey(String urid);

    int insert(ProjectPO record);

    int insertSelective(ProjectPO record);

    ProjectPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(ProjectPO record);

    int updateByPrimaryKey(ProjectPO record);
}