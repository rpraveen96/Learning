package com.learn.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String SayHi(){
        System.out.println("inside method 1 ");
        return "Hi";
    }

    @RequestMapping("/helloWorld")
    public String SayHelloWorld(){
        return "HelloWorld";
    }


}
