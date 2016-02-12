package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
public class Item implements Serializable {

	   
	
	private int idItem;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public float getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(float currentprice) {
		this.currentprice = currentprice;
	}
	private String Label;
	private Blob image;
	private float currentprice;
	private static final long serialVersionUID = 1L;

	private Product product;
	private ShoppingCart shoppingCart;
	
	public Item() {
		super();
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}   

	@ManyToOne
	@JoinColumn(name="FK_PRODUCT")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@ManyToOne
	@JoinColumn(name="FK_SHOPCART")
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
   
}
