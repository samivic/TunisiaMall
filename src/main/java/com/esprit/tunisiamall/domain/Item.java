package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
public class Item implements Serializable {

	   
	
	private int idItem;
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
