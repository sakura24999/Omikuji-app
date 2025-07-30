package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OmikujiController {
    // index.htmlを表示
    @RequestMapping("/index") 
    public string index() {
        return "index";
    }

    // result.htmlを表示
    @RequestMapping("/result")
    public string result() {
        return "result";
    }
}
