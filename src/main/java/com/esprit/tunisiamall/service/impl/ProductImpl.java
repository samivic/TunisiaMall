	package com.esprit.tunisiamall.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.tunisiamall.domain.Product;
import com.esprit.tunisiamall.service.interfaces.ProductService;

@Stateless(name="Product")
public class ProductImpl implements ProductService {

	public ProductImpl() {
		
	}
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Boolean addProduct(Product product) {
		try {
			em.persist(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean removeProduct(Product product) {
		try {
			em.remove(em.merge(product));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateProduct(Product product) {
		try {
			em.merge(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public List<Product> findAllProduct() {
		Query query=em.createQuery("SELECT p FROM Product p");
		
		return query.getResultList();
		
	}

	@Override
	public Product findProdcutById(Integer id) {

		Product product=null;
		try {
			product= em.find(Product.class, id);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return product;
	}


}
