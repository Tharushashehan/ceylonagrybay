package com.portal.dao;

import java.util.List;

import com.portal.model.User;

public interface UserDao {
	
	public void save(User user);
	
	public List<User> list();

}
