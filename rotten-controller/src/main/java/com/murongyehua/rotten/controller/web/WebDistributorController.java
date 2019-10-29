package com.murongyehua.rotten.controller.web;

import cn.hutool.core.util.StrUtil;
import com.murongyehua.rotten.controller.commom.AttributeManager;
import com.murongyehua.rotten.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Controller
public class WebDistributorController {

    @RequestMapping("/htmlTset")
    public String htmlTest(){
        return "test.html";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        UserDTO userDTO = AttributeManager.getUser(request);
        if (StrUtil.isEmpty(userDTO.getUrid())) {
            return "login/login.html";
        }
        return "index.html";
    }

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @RequestMapping("/login")
    public String login(){
        return "login/login.html";
    }



}
