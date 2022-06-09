/**
 * 
 */
package com.ajprojects.springbootbackend.Basics.repo;

import org.springframework.data.repository.CrudRepository;

import com.ajprojects.springbootbackend.Basics.datamodels.User;

/**
 * @author 40119273
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
