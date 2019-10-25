package com.murongyehua.rotten.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Controller
public class WebDistributorController {

    @RequestMapping("/htmlTset")
    public String hemlTest(){
        return "test.html";
    }

}
