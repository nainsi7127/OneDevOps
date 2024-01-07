package com.onedevops.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
