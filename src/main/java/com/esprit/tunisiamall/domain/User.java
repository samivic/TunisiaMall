package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private int id;
	private String name;
	private String mail;
	private int age;
	private String address;
	private String password;
	private String role;
	private static final long serialVersionUID = 1L;
	
	
	private GuestBook guestbook;
	public User() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	@ManyToOne
	@JoinColumn(name="FK_GuestBook")
	public GuestBook getGuestbook() {
		return guestbook;
	}
	public void setGuestbook(GuestBook guestbook) {
		this.guestbook = guestbook;
	}
	
   
}
