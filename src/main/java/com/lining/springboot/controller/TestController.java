package com.lining.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lining
 * @date 2019/7/17
 * @description TestController
 */
@Controller
public class TestController {
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "lining";
    }
}
