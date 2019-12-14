package com.cy.cgbquestionaire.controller;

import com.cy.cgbquestionaire.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    public TestService testService;

    @RequestMapping("doDelete")
    @ResponseBody
    public String test(){
        int rows = testService.deleteObjects(17,18);
        return "delete ok,rows="+rows;
    }

    @RequestMapping("doTestThymeleaf")
    public String testThealeaf(){
        return "TestHTML";
    }

    @RequestMapping("doTestJSP")
    public String testJSP(){
        return "testJSP";
    }


}
