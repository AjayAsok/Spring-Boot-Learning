/**
 * 
 */
package com.ajprojects.springbootbackend.Basics.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajprojects.springbootbackend.Basics.datamodels.User;
import com.ajprojects.springbootbackend.Basics.repo.UserRepository;

/**
 * @author 40119273
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {

		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(usr -> users.add(usr));
		return users;

	}

	public User saveDetails(User user) {
		return userRepository.save(user);
	}
}
