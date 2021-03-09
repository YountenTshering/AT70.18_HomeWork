package com.example.MidExam.controller;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.MidExam.helper.LocalDateConverter;
import com.example.MidExam.model.Employee;
import com.example.MidExam.model.Level;
import com.example.MidExam.model.Address;
import com.example.MidExam.model.User;
import com.example.MidExam.service.EmailService;
import com.example.MidExam.service.EmpolyeeService;
import com.example.MidExam.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    EmailService emailService;

    @Autowired
    EmpolyeeService employeeService;

    // @GetMapping("/")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "home.jsp";
    }

    // admin
    // @GetMapping("admin")
    @RequestMapping(path = "admin", method = RequestMethod.GET)
    public ModelAndView admin_home() {

        List<User> allUsers = userService.findAllUsers();

        ModelAndView mv = new ModelAndView("admin_home.jsp");
        mv.addObject("users", allUsers);

        return mv;
    }

    // view all
    // @GetMapping("admin/viewUserEdit")
    @RequestMapping(path = "admin/viewUserEdit", method = RequestMethod.GET)
    public ModelAndView admin_viewUserEdit() {

        List<Employee> allEmployees = EmailService.getEmpolyee();

        ModelAndView mv = new ModelAndView("viewUserEdit.jsp");
        mv.addObject("viewUserEdit", allEmployees);

        return mv;
    }

    // add user
    // @GetMapping("admin/addUser")
    @RequestMapping(path = "admin/addUser", method = RequestMethod.GET)
    public String show_add_user_form() {
        return "add_User.jsp";
    }

    // @PostMapping("admin/addUser")
    @RequestMapping(path = "admin/addUser", method = RequestMethod.POST)
    public String add_User(Employee employee, Principal principal) {

        LocalDateConverter converter = new LocalDateConverter();
        employee.setDOB(converter.convertToEntityAttribute(employee.getDOB_()));

        User currentUser = userService.findByUsername(principal.getName());

        employeeService.save(employee);

        return "redirect:/admin/viewUserEdit";
    }

    // update employee
    // @GetMapping("admin/editEmployee/{employeeId}")
    @RequestMapping(path = "admin/editEmployee/{employeeId}", method = RequestMethod.GET)
    public ModelAndView show_edit_employee(@PathVariable("employeeId") int employeeId) {

        Employee emp = employeeService.findById(employeeId);

        ModelAndView mv = new ModelAndView("edit_user.jsp");
        mv.addObject("employee", emp);
        mv.addObject("leve", Level.values());
        return mv;
    }

    // @PostMapping("/admin/editEmployee")
    @RequestMapping(path = "/admin/editEmployee", method = RequestMethod.POST)
    public String edit_employee(Employee employee) {

        employeeService.save(employee);

        return "ok";
    }

    // Admin sent mail to user for update
    // @PostMapping("admin/sendMail/{userId}")
    @RequestMapping(path = "admin/sendMail/{userId}", method = RequestMethod.POST)
    public String send_mail(@PathVariable("userId") int userId, @PathVariable("employeeId") int employeeId) {

        User user = userService.findById(userId);
        Employee employee = employeeService.findById(employeeId);

        SimpleMailMessage emailMsg = new SimpleMailMessage();
        emailMsg.setTo(user.getEmail());
        emailMsg.setText("Hey " + user.getUsername() + "! You are performing well");
        emailMsg.setSubject("Update on your progress");
        emailMsg.setFrom("admin@random.asia");

        emailService.sendEmail(emailMsg);

        return "redirect:/admin";
    }
}