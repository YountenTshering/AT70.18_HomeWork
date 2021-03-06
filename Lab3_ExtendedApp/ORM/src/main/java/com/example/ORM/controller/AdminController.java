package com.example.ORM.controller;

import com.example.ORM.model.Leave;
import com.example.ORM.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private LeaveService leaveService;

    @GetMapping("/leaveRequests")
    public ModelAndView getLeaves() {

        ModelAndView mv = new ModelAndView("admin_home.jsp");
        List<Leave> leaves = leaveService.getAllUnapprovedLeaves();

        mv.addObject("leaves", leaves);

        return mv;
    }

    @Transactional
    @PostMapping("/leaveRequests/approve/{id}")
    public String approveLeave(@PathVariable("id") int id) {

        Leave leave = leaveService.getLeaveById(id);
        leave.setApproved(true);

        return "redirect:/admin/leaveRequests";
    }

    @Transactional
    @PostMapping("/leaveRequests/decline/{id}")
    public String declineLeave(@PathVariable("id") int id) {

        Leave leave = leaveService.getLeaveById(id);
        leave.setApproved(false);

        return "redirect:/admin/leaveRequests";
    }

}