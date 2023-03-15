package com.meher.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meher.models.Users;

@Service
public interface UsersService {
	List<Users> getAllUsers();
	List<Users> getUserById(Integer id);
	Users getUserByUsername(String username);
	Integer saveOrUpdateUser(Users users);
	void deleteUserById(Integer id);
}
