package com.monkeywen.mybatisbase.web;

import com.monkeywen.mybatisbase.service.BaseService;
import demo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("")
    private String helloWorld(){
        return "hello world";
    }
    @PostMapping("")
    private String saveStudent(@RequestBody Students students){
        baseService.save(students);
        return "success";
    }
}
