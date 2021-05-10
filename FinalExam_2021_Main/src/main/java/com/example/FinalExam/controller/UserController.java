package com.example.FinalExam.controller;

import java.security.Principal;

import com.example.FinalExam.models.User;
import com.example.FinalExam.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/")
    public ModelAndView home(Principal principal) {
        ModelAndView mv = new ModelAndView("home.jsp");
        User user = userService.findByUsername(principal.getName());
        mv.addObject("user", user);

        return mv;
    }

    @RequestMapping(path = "/logout-success")
    public String logout() {
        return "logout.jsp";
    }
}
