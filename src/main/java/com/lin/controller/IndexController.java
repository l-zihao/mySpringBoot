package com.lin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/19 20:51
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("index");
        return "index";
    }

}
