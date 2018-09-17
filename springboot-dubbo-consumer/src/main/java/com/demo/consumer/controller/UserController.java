package com.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.consumer.service.DemoServiceCon;

@RestController
public class UserController
{

    @Autowired
    DemoServiceCon demoServiceCon;

    @RequestMapping("test")
    public String index() throws Exception {
        return "OK:返回信息="+demoServiceCon.ConService();
    }

}
