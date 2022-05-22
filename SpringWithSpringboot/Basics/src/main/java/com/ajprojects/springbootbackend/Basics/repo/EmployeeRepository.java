/**
 * 
 */
package com.ajprojects.springbootbackend.Basics.repo;

import org.springframework.data.repository.CrudRepository;

import com.ajprojects.springbootbackend.Basics.datamodels.Employee;

/**
 * @author 40119273
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
