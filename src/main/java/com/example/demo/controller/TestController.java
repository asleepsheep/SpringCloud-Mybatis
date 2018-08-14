package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangfan
 * 2018/8/10 15:59
 */
@RestController
public class TestController {

    @GetMapping("/msg")
    public String showMsg() {
        return "this is message ";
    }
}
