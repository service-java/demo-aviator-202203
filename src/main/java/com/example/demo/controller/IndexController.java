package com.example.demo.controller;

import com.googlecode.aviator.AviatorEvaluator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @RequestMapping("/")
    public Object index(Integer age) {
        Long result = (Long) AviatorEvaluator.execute("1+2+3");
        return result;
    }

}
