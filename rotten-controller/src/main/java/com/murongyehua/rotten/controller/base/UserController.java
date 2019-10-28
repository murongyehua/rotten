package com.murongyehua.rotten.controller.base;

import cn.hutool.core.util.StrUtil;
import com.murongyehua.rotten.biz.base.UserService;
import com.murongyehua.rotten.dto.UserDTO;
import com.murongyehua.rotten.entity.ResultContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResultContext addUser(UserDTO userDTO) {
        if (StrUtil.isEmpty(userDTO.getUsername()) || StrUtil.isEmpty(userDTO.getNickname()) || StrUtil.isEmpty(userDTO.getPassword())) {
            return ResultContext.getFail("必填项为空");
        }
        return userService.addUser(userDTO);
    }

}
