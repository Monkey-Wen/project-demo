package com.monkeywen.helloworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("")
    private String helloWorld(){
        return "hello world";
    }
}
