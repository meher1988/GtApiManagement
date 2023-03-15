package com.meher.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meher.models.Users;
import com.meher.repo.UsersRepository;
import com.meher.services.UsersService;

@Service("UserServiceImpl")
public class UserServiceImpl implements UsersService{
	
	@Autowired
	UsersRepository userRepository;

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = userRepository.findAll();
		return users;
	}

	@Override
	public List<Users> getUserById(Integer id) {
		List<Users> user = userRepository.findByid(id);
		return user;
	}

	@Override
	public Users getUserByUsername(String username) {
		Users user = userRepository.findByusername(username);
		return user;
	}

	@Override
	public Integer saveOrUpdateUser(Users users) {
		try {
			userRepository.save(users);
			Integer rowId = users.getId();
			return rowId;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public void deleteUserById(Integer id) {
			userRepository.deleteById(id);
	}

	

	
}
