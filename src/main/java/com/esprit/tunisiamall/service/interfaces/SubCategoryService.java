package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.SubCategory;

@Local
public interface SubCategoryService {

	Boolean addSubCategory(SubCategory subcategory);
	Boolean removeSubCategory(SubCategory subcategory);
	Boolean updateSubCategory(SubCategory subcategory);
	SubCategory findSubCategoryById(Integer id);
	List<SubCategory> findSubCategory();
}
