package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Category;

@Local
public interface CategoryService {

	Boolean addCategory(Category category);
	Boolean removeCategory(Category category);
	Boolean updateCategory(Category category);
	List<Category> findAllCategory();
	Category findCategoryByName(String name);
}
