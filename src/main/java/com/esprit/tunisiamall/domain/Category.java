package com.esprit.tunisiamall.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	
	private int idCategory;
	private String name;
	private static final long serialVersionUID = 1L;
	
	

	public Category() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
   
}
