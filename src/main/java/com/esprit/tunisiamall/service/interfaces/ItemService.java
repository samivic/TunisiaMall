package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.esprit.tunisiamall.domain.Item;

@Local
public interface ItemService {

	Item findItemById(Integer id);
	Boolean addItem(Item item);
	Boolean removeItem(Item item);
	Boolean updateItem(Item item);
	List<Item> findAllItem();
	
}
