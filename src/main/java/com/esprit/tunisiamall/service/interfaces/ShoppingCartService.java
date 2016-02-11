package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Item;
import com.esprit.tunisiamall.domain.ShoppingCart;

@Local
public interface ShoppingCartService {

	Boolean addToCart(ShoppingCart cart, Item item);
	Boolean removeFromCart(ShoppingCart cart, Item item);
	Float calculatTotalPrice(Integer price);
	List<Item> findAllItemInCart(ShoppingCart cart);
	
}
