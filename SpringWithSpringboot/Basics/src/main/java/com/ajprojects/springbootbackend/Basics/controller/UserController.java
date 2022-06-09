package com.ajprojects.springbootbackend.Basics.controller;

/**
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajprojects.springbootbackend.Basics.datamodels.User;
import com.ajprojects.springbootbackend.Basics.service.UserService;

/**
 * @author AJayAsok
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping
	public List<User> getEmployees() {
		return userService.getAllUsers();
	}

	@PostMapping
	public User saveEmployeeDetails(@RequestBody User user) {
		return userService.saveDetails(user);

	}
}