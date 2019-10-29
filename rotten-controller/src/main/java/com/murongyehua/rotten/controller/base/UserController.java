package com.murongyehua.rotten.controller.base;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.murongyehua.rotten.biz.base.UserService;
import com.murongyehua.rotten.controller.commom.AttributeManager;
import com.murongyehua.rotten.dto.UserDTO;
import com.murongyehua.rotten.entity.ResultContext;
import com.murongyehua.rotten.enums.ENUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@RestController
@RequestMapping("/rotten/base/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResultContext addUser(UserDTO userDTO,HttpServletRequest request) {
        if (StrUtil.isEmpty(userDTO.getUsername()) || StrUtil.isEmpty(userDTO.getNickname()) || StrUtil.isEmpty(userDTO.getPassword())) {
            return ResultContext.getFail("必填项为空");
        }
        UserDTO currentUser = AttributeManager.getUser(request);
        if (StrUtil.isEmpty(currentUser.getUrid())) {
            return ResultContext.getFail("未登录");
        }
        userDTO.setCurrentUserId(currentUser.getUrid());
        if (!ENUserType.MANAGER.getValue().equals(currentUser.getType())) {
            return ResultContext.getFail("没有权限");
        }
        return userService.addUser(userDTO);
    }

    @PostMapping("/login")
    public ResultContext login(UserDTO userDTO, HttpServletRequest request) {
        if (StrUtil.isEmpty(userDTO.getUsername()) || StrUtil.isEmpty(userDTO.getPassword())) {
            return ResultContext.getFail("必填项为空");
        }
        ResultContext resultContext = userService.login(userDTO);
        AttributeManager.setUser(request, resultContext.getData());
        return resultContext;
    }

    @PostMapping("/get")
    public ResultContext get(HttpServletRequest request) {
        UserDTO userDTO = AttributeManager.getUser(request);
        return ResultContext.getFail("操作成功",userDTO);
    }

}
