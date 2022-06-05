package com.SamarPFE.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {

	@Id
	private int id;
	private String nom;
	private String email;
	private String password ;
	
	
	
	
	
	public Agent() {
		super();
	}
	public Agent(int id, String nom, String email, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
