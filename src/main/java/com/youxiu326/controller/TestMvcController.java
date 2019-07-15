package com.youxiu326.controller;

import com.youxiu326.annotation.MyController;
import com.youxiu326.annotation.MyRequestMapping;

@MyController
@MyRequestMapping("/mvc")
public class TestMvcController {


    @MyRequestMapping("/index")
    public String index(){

        System.out.println("手写springmvc框架...");

        return "index";
    }

}
