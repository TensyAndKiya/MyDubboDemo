package com.clei.service.impl;

import com.clei.service.StudentService;
import org.springframework.stereotype.Service;

//阿里巴巴提供的service注解
@Service("studentService")
public class StudengServiceImpl implements StudentService {
    @Override
    public String hello(String name) {
        return "Hello, "+name;
    }
}
