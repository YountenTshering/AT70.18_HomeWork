package com.example.DesignPatterns.controller;

import com.example.DesignPatterns.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping("UserAuto")
    public String getUser1() {
        User u = User.builder().email("st121775@ait.asia").name("Younten").nationality("Bhutan").uid(777).build();
        System.out.println(u.toString());
        return "created!";
    }

}
