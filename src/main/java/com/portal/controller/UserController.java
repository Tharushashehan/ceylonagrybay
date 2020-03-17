package com.portal.controller;

import org.springframework.web.bind.annotation.*;

import com.portal.exception.ResourceNotFoundException;
import com.portal.model.User;

import javax.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.portal.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	// Get All users
	@GetMapping("/user-list")
	public List<User> getAllUsers() {
	    return userRepository.findAll();
	}
	
	//Create User
	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
	    return userRepository.save(user);
	}
	
	// Get a Single user
	@GetMapping("/single-user/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
	    return userRepository.findById(userId)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", userId));
	}
	
	// Update a user
	@PutMapping("/put-user/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {

	    User user = userRepository.findById(userId)
	            .orElseThrow(() -> new ResourceNotFoundException("user", "id", userId));

	    user.setF_name(userDetails.getF_name());
	    user.setL_name(userDetails.getF_name());

	    User updatedNode = userRepository.save(user);
	    return updatedNode;
	}
	
	// Delete a user
	@PutMapping("/delete-user/{id}")
	public User deleteUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {

	    User user = userRepository.findById(userId)
	            .orElseThrow(() -> new ResourceNotFoundException("user", "id", userId));
	    
	    user.setStatus_code(false);

	    User deletedNote = userRepository.save(user);
	    return deletedNote;
	}

}
