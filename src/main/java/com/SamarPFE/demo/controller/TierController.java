package com.SamarPFE.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SamarPFE.demo.entity.Tier;
import com.SamarPFE.demo.repository.TierRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/tier")
public class TierController {

	
	@Autowired
	TierRepository tierRepo;
	
	@PostMapping("/addTier")
	public Tier addTier(@RequestBody Tier t)
	{
		return 		tierRepo.save(t);

	}

	@DeleteMapping("delete")
	public boolean delete(@RequestParam int id )
	{
		Optional<Tier> t=tierRepo.findById(id);
		    tierRepo.delete(t.get()); 
		    return true;
	}
	@GetMapping("/getAll")
	public List<Tier> getAll()
	{
		return 		tierRepo.findAll();

	}
	
}
