package com.example.demo.repository;

import java.util.List;
import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{

	List<User> findByUsernameAndPassword(String username, String password);
	List<User> findByUsername(String username);
	
}
