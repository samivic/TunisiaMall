package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity
public class Event implements Serializable {

	
	private int idEvent;
	private String name;
	private Date dateEvent;
	private String description;
	private static final long serialVersionUID = 1L;

	private List<User> customer;

	public Event() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdEvent() {
		return this.idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}  
	@Temporal(TemporalType.DATE)
	public Date getDateEvent() {
		return this.dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@ManyToMany
	public List<User> getCustomer() {
		return customer;
	}
	public void setCustomer(List<User> customer) {
		this.customer = customer;
	}   
	
   
}
