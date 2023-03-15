package com.meher.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meher.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	Users findByusername(String username);
	List<Users> findByid(Integer id);
	void deleteById(Integer id);
}
