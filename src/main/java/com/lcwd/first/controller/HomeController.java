package com.lcwd.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class HomeController
{
    @RequestMapping("/todos")
    public List<String> justTest(){

        List<String> todos=Arrays.asList("Learn Java","Learn Spring Boot","Developer");
        return todos;
    }
}
