package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	
	private String Name;
	
	private String email;
	
	private String phone;
	
	private String Password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Student(int id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.phone = phone;
		Password = password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
