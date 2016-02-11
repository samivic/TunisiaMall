package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ShoppingCart
 *
 */
@Entity

public class ShoppingCart implements Serializable {

	   

	private int idCart;
	private Date datebuy;
	private float totalprice;
	private static final long serialVersionUID = 1L;
	
	private User customer;
	

	public ShoppingCart() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCart() {
		return this.idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}   

	@Temporal(TemporalType.DATE)
	public Date getDatebuy() {
		return datebuy;
	}
	public void setDatebuy(Date datebuy) {
		this.datebuy = datebuy;
	}
	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	@ManyToOne
	@JoinColumn(name="FK_Customer")
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	
   
}
