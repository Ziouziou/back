package com.SamarPFE.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamarPFE.demo.entity.Agent;

public interface AgentRepository  extends JpaRepository<Agent, Integer>{

}
