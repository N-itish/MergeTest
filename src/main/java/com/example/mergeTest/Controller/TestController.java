package com.example.mergeTest.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String name){
        return "Hello "+name;
    }


}
