package com.test.springtestapp01.controller;

import com.test.springtestapp01.entity.TestEntity;
import com.test.springtestapp01.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TestController {
    @Autowired
    TestRepository testRepository;

    @GetMapping("/retrieve")
    public String getEntities(){
        return "Hello World";
    }
}
