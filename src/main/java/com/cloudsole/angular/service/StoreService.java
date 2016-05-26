package com.cloudsole.angular.service;

import java.util.List;

import com.cloudsole.angular.model.Category;
import com.cloudsole.angular.model.Product;

public interface StoreService
{

	//returns all products
	List<Product> viewAllProducts();
	//generates the category list depending on the product list
    List<Category> filterCategories(List<Product> products);
    //finds an existing category and returns its index (return -1 if not found)
    int findCategory(List<Category> cats, String name);
}
