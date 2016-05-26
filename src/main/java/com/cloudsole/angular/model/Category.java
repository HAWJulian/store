package com.cloudsole.angular.model;

import java.util.List;

public class Category
{
	private String			name;
	private List<Product>	items;
	private boolean 		isSubcategory;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<Product> getItems()
	{
		return items;
	}

	public void setItems(List<Product> items)
	{
		this.items = items;
	}

	public boolean equals(Object cat)
	{
		if (cat == null || !(cat instanceof Category))
		{
			return false;
		}
		return(this.name.equalsIgnoreCase(((Category)cat).name));
	}
	public boolean matchesString(String name)
	{
		return(this.name.equalsIgnoreCase(name));
	}
	public int hashCode()
	{
		return this.items.hashCode();
	}

	public boolean isSubcategory()
	{
		return isSubcategory;
	}

	public void setSubcategory(boolean isSubcategory)
	{
		this.isSubcategory = isSubcategory;
	}
}
