package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Shop
 *
 */
@Entity

public class Shop implements Serializable {

	
	private int idShop;
	private String name;
	private User owner;
	private String description;
	private String placement;
	

	
	private User shopOwner;
	private Category category;
	
	private static final long serialVersionUID = 1L;

	public Shop() {
		super();
	} 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getPlacement() {
		return this.placement;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}

	
	@OneToOne
	public User getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(User shopOwner) {
		this.shopOwner = shopOwner;
	}
	@ManyToOne
	@JoinColumn(name="FK_Category")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	} 
   
}
