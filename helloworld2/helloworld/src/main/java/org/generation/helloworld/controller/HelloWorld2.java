package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/bsm/objetivo")
public class HelloWorld2 {
    @GetMapping
    public String helloworld() {
        return "Alô Mundo!";
    
    }
}