package com.murongyehua.rotten.dao.mapper;

import com.murongyehua.rotten.dao.po.MessageCheckPO;

public interface RottenMessageCheckDao {
    int deleteByPrimaryKey(String urid);

    int insert(MessageCheckPO record);

    int insertSelective(MessageCheckPO record);

    MessageCheckPO selectByPrimaryKey(String urid);

    int updateByPrimaryKeySelective(MessageCheckPO record);

    int updateByPrimaryKey(MessageCheckPO record);
}