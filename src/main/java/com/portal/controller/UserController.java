package com.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portal.model.User;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	User user;
	
	// Get All users
	@GetMapping("/user-list")
	public List<User> getAllUsers() {
	    return null;
	}
	
	//Create User
	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
	    return null;
	}
	
	// Get a Single user
	@GetMapping("/single-user/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
	    return null;
	}
	
	// Update a user
	@PutMapping("/put-user/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {
	    return null;
	}
	
	// Delete a user
	@PutMapping("/delete-user/{id}")
	public User deleteUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {
	    return null;
	}

}
