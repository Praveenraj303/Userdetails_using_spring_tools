package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Userentity {
	@Id
	private int id;
	private String name;
	private int age;
	private String password;
	private String dob;
	
	
	
	
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String name, int age, String password, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.password=password;
		this.dob=dob;
	}
		
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
