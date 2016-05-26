package com.cloudsole.angular.model;

import java.util.List;

public class Result
{
	public List<Category> categories;
	public List<Product> products;
	public List<Category> getCategories()
	{
		return categories;
	}
	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}
	public List<Product> getProducts()
	{
		return products;
	}
	public void setProducts(List<Product> products)
	{
		this.products = products;
	}
}
