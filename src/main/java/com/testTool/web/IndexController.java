package com.testTool.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

//    @RequestMapping(value = "hoge", method = RequestMethod.GET)
//    public String hoge(Model model) {
//        int width = 300;
//        int height = 200;
//    }
}