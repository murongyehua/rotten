package com.murongyehua.rotten.controller.commom;

import cn.hutool.core.bean.BeanUtil;
import com.murongyehua.rotten.dao.po.UserPO;
import com.murongyehua.rotten.dto.UserDTO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
public class AttributeManager {

    private static final String USER_INFO = "userInfo";

    public static UserDTO getUser(HttpServletRequest request){
        UserPO userPO = (UserPO) request.getSession().getAttribute(USER_INFO);
        UserDTO userDTO = new UserDTO();
        BeanUtil.copyProperties(userPO, userDTO);
        return userDTO;
    }

    public static void setUser(HttpServletRequest request, Object userPO){
        request.getSession().setAttribute(USER_INFO, userPO);
    }

}
