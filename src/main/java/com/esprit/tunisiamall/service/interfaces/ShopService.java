package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Category;
import com.esprit.tunisiamall.domain.Shop;

@Local
public interface ShopService {

	Boolean addShop(Shop shop);
	Boolean updateShop(Shop shop);
	Boolean removeShop(Shop shop);
	List<Shop> findAllShops();
	List<Shop> findShopByCategory (Category category);
	
}
