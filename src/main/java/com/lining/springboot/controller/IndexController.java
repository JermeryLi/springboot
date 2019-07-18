package com.lining.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lining
 * @date 2019/7/17
 * @description TestController
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("")
    public String test(Model model){
        model.addAttribute("value","lining");
        return "index";
    }
}
