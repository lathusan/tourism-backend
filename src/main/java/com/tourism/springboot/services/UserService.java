package com.tourism.springboot.services;

import java.util.List;

import com.tourism.springboot.entities.User;


public interface UserService {

	public void addUser(User user);

	public List<User> getUser();

	public User getUserById(Long id);
	
	public void updateUser (User customer);
	
}
