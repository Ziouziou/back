package com.SamarPFE.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.function.EntityResponse;

import com.SamarPFE.demo.entity.Tier;
import com.SamarPFE.demo.entity.User;
import com.SamarPFE.demo.repository.UserRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "user")
public class UserController {
	@Autowired
	EntityManager em;
	@Autowired
	UserRepository userRepo;
	@PostMapping(path = "/add")
	public User addUser(@RequestBody User u)
	{
	
			return userRepo.save(u);
		
	}
	@PostMapping("/addUser")
	public User addTier(@RequestBody User t)
	{
		return 		userRepo.save(t);

	}
	
	@GetMapping("/checkUser")
	  public ResponseEntity<User> getUsersByEmailPassword(@PathParam(value = "email") String email,@PathParam(value = "password") String password)
	  {
		
		
		    return ResponseEntity.ok().body(userRepo.findByEmailAndPassword(email, password));
 
	  }
	
	@GetMapping("/getAll")
	  public List<User> getAll() 
	  {
		
		
		    return this.userRepo.findAll();
	  }
	
	@GetMapping("/deleteUser")
	  public boolean deleteUser(@PathParam("id") int id) 
	  {
		
		
		   this.userRepo.deleteById(id);
		   return true;
	  }

	@GetMapping("/getAlldm")
	  public List get() 
	  {
		
		
		Query query=	this.em.createNativeQuery("select * from dt122");
		  List val =  query.getResultList() ;
		  return val;
	  }
	

}
