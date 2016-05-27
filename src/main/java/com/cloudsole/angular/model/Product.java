package com.cloudsole.angular.model;
//describes attributes of a product
public class Product
{
	private String name;
	private int id;
	private boolean cooling;
	//price in cents
	private int price;
	private String brand;
	private String category;
	private String subcategory;
	private boolean isBio;
	private boolean isVegeterian;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public boolean isCooling()
	{
		return cooling;
	}
	public void setCooling(boolean cooling)
	{
		this.cooling = cooling;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getSubcategory()
	{
		return subcategory;
	}
	public void setSubcategory(String subcategory)
	{
		this.subcategory = subcategory;
	}
	public boolean isBio()
	{
		return isBio;
	}
	public void setBio(boolean isBio)
	{
		this.isBio = isBio;
	}
	public boolean isVegeterian()
	{
		return isVegeterian;
	}
	public void setVegetarian(boolean isVegetarian)
	{
		this.isVegeterian = isVegetarian;
	}
}
