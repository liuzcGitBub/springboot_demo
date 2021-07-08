package com.example.springboot_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 15827
 */
@RestController
public class TestController {

    //测试
    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String  getPort(){
        return port;
    }

    @GetMapping("/getTomacatVersion")
    public String  getTomacatVersion(){
        return "version10.0.0.1";
    }

    @GetMapping("/getName")
    public String getName(){
        return "测试";
    }

    @GetMapping("getTest")
    public String getTest(){
        return "测试";
    }
}
