package com.huice.springbootdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestConrtroller {

    @RequestMapping("/{str}")
    public String testStr(@PathVariable("str") String s) {
        return s;
    }
}
