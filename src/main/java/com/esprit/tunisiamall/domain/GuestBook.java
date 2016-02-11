package com.esprit.tunisiamall.domain;

import com.esprit.tunisiamall.domain.User;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: GuestBook
 *
 */
@Entity
public class GuestBook implements Serializable {

	
	private int idGuestbook;
	private String message;
	private Date date;
	private static final long serialVersionUID = 1L;

	
	public GuestBook() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdGuestbook() {
		return this.idGuestbook;
	}

	public void setIdGuestbook(int idGuestbook) {
		this.idGuestbook = idGuestbook;
	}   
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}  
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

   
}
