package com.example.MVC_Postman.controller;

import java.util.List;

import com.example.MVC_Postman.deo.EmployeeDao;
import com.example.MVC_Postman.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao dao;

    private static final String HOME_SCREEN = "home.jsp";
    private static final String ADD_EMPLOYEE_SCREEN = "add.jsp";
    private static final String EDIT_EMPLOYEE_SCREEN = "edit.jsp";

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv= new ModelAndView(HOME_SCREEN);
        // Show all users list in homepage
        List<Employee> employeeList = dao.findAll();
        mv.addObject("employeeList", employeeList);
        System.out.println(employeeList);

        return mv;
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        // Show all users list in homepage
        List<Employee> employeeList = dao.findAll();
        System.out.println("Listing Employees\n\n" + employeeList + "\n\n");
        model.addAttribute("employeeList", employeeList);
        return HOME_SCREEN;
    }

    // Add Employee Screen
    @RequestMapping(path="/add", method = RequestMethod.GET)
    public String showAddForm() {
        return ADD_EMPLOYEE_SCREEN;
    }

    // Edit Employee Screen
    @RequestMapping(path="/edit", method = RequestMethod.GET)
    public String showEditForm() {
        return EDIT_EMPLOYEE_SCREEN;
    }

    // Add Employee to DB
    @RequestMapping(path="/employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView addNewEmployee(Employee emp) {
        ModelAndView mv= new ModelAndView(HOME_SCREEN);
        dao.save(emp);
        System.out.println("Employee added. Returning to Homepage");
        // Show home screen once added
        return mv;
    }

    // Edit or Add Employee to DB
    @RequestMapping(path="/employee", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String editOrAddEmployee(Employee emp) {
       dao.save(emp);
        System.out.println("Employee updated. Returning to Homepage");
       return HOME_SCREEN;
    }

    // Delete Employee from DB
    @RequestMapping(path="/employee/{eid}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUser(@PathVariable("eid") int eid) {
        Employee emp = dao.getOne(eid);
        dao.delete(emp);
        return HOME_SCREEN;
    }
}
