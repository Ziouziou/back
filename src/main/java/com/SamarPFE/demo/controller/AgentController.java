package com.SamarPFE.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SamarPFE.demo.entity.Agent;
import com.SamarPFE.demo.repository.AgentRepository;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping(path="/agent")

public class AgentController {
	
	@Autowired
	 AgentRepository agentRepo;
	
	@GetMapping(path="/getAll")
	public List<Agent> getAllAgent()
	{
		return this.agentRepo.findAll();
	}
	
	@PutMapping(path="edit")
	public boolean editAgent(@PathParam("id") int id )
	{
		return true;
		
	}
	
	@DeleteMapping(path="delete")
	public boolean suppAgent(@PathParam("id") int id)
	{
		this.agentRepo.deleteById(id);
		return true;
	}
	
	
}
