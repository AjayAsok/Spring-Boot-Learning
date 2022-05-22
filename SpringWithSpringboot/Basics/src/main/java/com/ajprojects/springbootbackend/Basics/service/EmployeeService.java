/**
 * 
 */
package com.ajprojects.springbootbackend.Basics.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajprojects.springbootbackend.Basics.datamodels.Employee;
import com.ajprojects.springbootbackend.Basics.repo.EmployeeRepository;

/**
 * @author 40119273
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emp -> employees.add(emp));
		return employees;

	}

	public Employee saveDetails(Employee employee) {
		return employeeRepository.save(employee);
	}
}
