package com.murongyehua.rotten.biz.base;

import com.murongyehua.rotten.dto.UserDTO;
import com.murongyehua.rotten.entity.ResultContext;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
public interface UserService {

    /**
     * 管理员添加用户
     * @param userDTO
     * @return
     */
    ResultContext addUser(UserDTO userDTO);

    /**
     * 根据id获取用户信息
     * @param userDTO
     * @return
     */
    ResultContext getUserBySomething(UserDTO userDTO);

}
