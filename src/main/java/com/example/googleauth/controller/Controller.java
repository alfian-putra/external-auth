package com.example.googleauth.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello !";
    }

    @RequestMapping("/")
    void handleFoo(HttpServletResponse res) throws IOException {
        res.sendRedirect("/hello");
    }
}
