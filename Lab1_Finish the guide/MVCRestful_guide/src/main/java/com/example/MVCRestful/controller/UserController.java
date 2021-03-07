package com.example.MVCRestful.controller;

import java.util.List;
import java.util.Optional;

import com.example.MVCRestful.dao.UserDao;
import com.example.MVCRestful.dao.UserJPADao;
import com.example.MVCRestful.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserDao dao;

	@Autowired
	UserJPADao jpaDao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(path = "/addUser", method = RequestMethod.GET)
	public String addUser(User user) {
		dao.save(user);
		// redirect to home
		return "home.jsp";
	}

	@RequestMapping(path = "/getUser", method = RequestMethod.GET)
	public ModelAndView getUser(@RequestParam int eid) // @RequestParam is for ? request
	{
		ModelAndView mv = new ModelAndView("showUser.jsp"); // input the view name
		User e = dao.findById(eid).orElse(new User());
		mv.addObject(e); // add object to mv

		/*
		 * example how to use query we define at dao
		 * System.out.println(dao.findByNationlity("Bhutan"));
		 * System.out.println(dao.findByEidGreaterThan(101));
		 * System.out.println(dao.findByNationlitySorted("Bhutan"));
		 */

		return mv;
	}

	// part 1 restful calls using dao
	// RESTFUL GET ALL, USING CrudeRepo which returns java object
	@RequestMapping(path = "/users", method = RequestMethod.GET) // RESTful protocol for get all employees
	@ResponseBody // this annotation is for REST methods where view will not be rendered

	public String getUsersREST() {
		return dao.findAll().toString();

	}

	// RESTFUL GET ONE, USING CrudeRepo which returns java object
	@RequestMapping(path = "/user/{eid}", method = RequestMethod.GET) // RESTful protocol for get some wildcard employee
																		// with given eid
	@ResponseBody // this annotation is for REST methods where view will not be rendered
	public String getUserREST(@PathVariable("eid") int eid) {
		return dao.findById(eid).toString();

	}

	// part 2 restful calls jpaDao
	// RESTFUL GET (ALL) USING JPA
	// You can restrict to only json/xml format by using the "produces" parameter
	@RequestMapping(path = "/usersJPA", method = RequestMethod.GET, produces = "application/json") // , produces=
																									// {"application/xml"})
																									// //RESTful +
	// return JSON protocol for get all employees

	@ResponseBody // this annotation is for REST methods where view will not be rendered
	// This one uses jackson library (maven dependencies) to convert java object to
	// json

	public List<User> getUsersRESTJPA() {
		return jpaDao.findAll();
	}

	// RESTFUL GET ONE USING JPA
	@RequestMapping(path = "/userJPA/{eid}", method = RequestMethod.GET, produces = "application/json") // // given eid
	@ResponseBody // this annotation is for REST methods where view will not be rendered
	// Optional here means that it will return Employee, but if in case it does not
	// exist, it will return optional data

	public Optional<User> getUserRESTJPA(@PathVariable("eid") int eid) {
		return jpaDao.findById(eid);

	}

	// RESTFUL POST USING JPA
	// Instead of RequestMapping, you can also use PostMapping
	// By default, RequestMapping is GetMapping

	@RequestMapping(path = "/userJPA", method = RequestMethod.POST) // , consumes = {"application/json"})
	@ResponseBody // this annotation is for REST methods where view will not be rendered
	// RequestBody is used so we can also send using raw format, aside from form
	// format
	public User postUser(@RequestBody User user) {
		jpaDao.save(user);
		return user;
	}

	// RESTFUL DELETE USING JPA
	// simply uses method Delete for delete
	// for dao, the repository class has delete function
	@RequestMapping(path = "/userJPA/{eid}", method = RequestMethod.DELETE) // , consumes = {"application/json"})
	@ResponseBody // this annotation is for REST methods where view will not be rendered
	// RequestBody is used so we can also send using raw format, aside from form
	// format
	public String deleteUser(@PathVariable("eid") int uid) {
		User user = jpaDao.getOne(uid);
		jpaDao.delete(user);
		return "deleted";
	}

	// RESTFUL PUT USING JPA
	// will update if exist, otherwise create
	@RequestMapping(path = "/userJPA", method = RequestMethod.PUT) // , consumes = {"application/json"})
	@ResponseBody // this annotation is for REST methods where view will not be rendered
	// RequestBody is used so we can also send using raw format, aside from form
	// format

	public String saveOrUpdateEmployee(@RequestBody User user) {
		jpaDao.save(user);
		return "updated";
	}

}
