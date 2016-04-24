package com.cloudsole.angular.model;
//describes attributes of a product
public class Item
{
	private String name;
	private int id;
	private boolean cooling;
	private int price;
	private String brand;
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
}
