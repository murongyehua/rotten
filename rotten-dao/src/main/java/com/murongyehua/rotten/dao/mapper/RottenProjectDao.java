package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.ProjectPO;

import java.util.List;

public interface RottenProjectDao {
    int deleteByPrimaryKey(String urid);

    int insert(ProjectPO record);

    int insertSelective(ProjectPO record);

    ProjectPO selectByPrimaryKey(String urid);

    List<ProjectPO> selectBySelective(ProjectPO projectPO);

    int isProjectExist();

    int updateByPrimaryKeySelective(ProjectPO record);

    int updateByPrimaryKey(ProjectPO record);
}