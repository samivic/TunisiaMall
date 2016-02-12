package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.tunisiamall.domain.Product;

@Remote
public interface ProductService {

	Boolean addProduct(Product product);
	Boolean removeProduct(Product product);
	Boolean updateProduct(Product product);
	List<Product>findAllProduct();
	Product findProdcutById(Integer id);
}
