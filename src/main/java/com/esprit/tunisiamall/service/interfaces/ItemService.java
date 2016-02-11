package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Item;

@Local
public interface ItemService {

	List<Item> findByAllItem();
	Item findItemById(Integer id);
	
}
