package com.SamarPFE.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SamarPFE.demo.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
 
	@Query("select u from User u Where u.email= ?1 and u.password= ?2")
	User findByEmailAndPassword(String email , String password);
	
	@Query("select count(*) from User u Where u.role = ?1")
	int findCountByRole(String role);
}
