package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @RequestMapping("/")
    public Object index(Integer age) {
        // Long result = (Long) AviatorEvaluator.execute("1+2+3");

        String fun = "(a+b)/3";
        Map map = new HashMap<>();
        map.put("a",11);
        map.put("b",22);
        Object result = AviatorEvaluator.execute(fun, map);

        return result;
    }

}
