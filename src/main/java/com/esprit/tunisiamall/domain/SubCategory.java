package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubCategory
 *
 */
@Entity

public class SubCategory implements Serializable {

	
	private int idSub;
	private String name;
	private static final long serialVersionUID = 1L;

	private Shop shop;
	public SubCategory() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdSub() {
		return this.idSub;
	}

	public void setIdSub(int idSub) {
		this.idSub = idSub;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne
	@JoinColumn(name="FK_Shop")
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}   
	
   
}
