package com.esprit.tunisiamall.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.tunisiamall.domain.Item;
import com.esprit.tunisiamall.service.interfaces.ItemService;

@Stateless(name="ItemClasse")
public class ItemImpl implements ItemService {

	public ItemImpl() {
		
	}
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Boolean addItem(Item item) {
		try {
			em.persist(item);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean removeItem(Item item) {
		try {
			em.remove(em.merge(item));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateItem(Item item) {
		try {
			em.merge(item);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public List<Item> findAllItem() {
		Query query=em.createQuery("SELECT p FROM Item p");
		
		return query.getResultList();
		
	}

	@Override
	public Item findItemById(Integer id) {
Item item=null;
		try {
			item=em.find(Item.class, id);
		} catch (Exception e) {
		} return item;
	}


}
