package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Request
 *
 */
@Entity

public class Request implements Serializable {

	
	private int idRequest;
	private String name;
	private String mail;
	private int age;
	private String address;
	private String password;
	private String role;
	private static final long serialVersionUID = 1L;

	public Request() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdRequest() {
		return this.idRequest;
	}

	public void setIdRequest(int idRequest) {
		this.idRequest = idRequest;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
   
}
