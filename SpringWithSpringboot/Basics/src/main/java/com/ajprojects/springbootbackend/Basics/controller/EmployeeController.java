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

import com.ajprojects.springbootbackend.Basics.datamodels.Employee;
import com.ajprojects.springbootbackend.Basics.service.EmployeeService;

/**
 * @author AJayAsok
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.saveDetails(employee);

	}
}