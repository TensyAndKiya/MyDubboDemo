package com.clei.controller;

import com.clei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("controller")
@Controller
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("invoke")
    @ResponseBody
    public String invoke(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(studentService);
        return studentService.hello("aaaaaaaa");
    }
}
