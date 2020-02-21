package com.testTool.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public void request() {

    }

    private void createRequestJson() {
        //MockRequest request = new MockRequest();
    }


//    @RequestMapping(value = "sendMockRequest", method = RequestMethod.GET)
//    public String sendMockRequest(Model model) {
//        int width = 300;
//        int height = 200;
//    }


}