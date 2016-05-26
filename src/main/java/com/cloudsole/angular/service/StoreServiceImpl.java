package com.cloudsole.angular.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.cloudsole.angular.model.Category;
import com.cloudsole.angular.model.Product;
@Service
public class StoreServiceImpl implements StoreService
{
	List<Product> Products = new ArrayList<Product>();
    private static Long id = 0L;
    //TODO: get Products from database
    
    @PostConstruct
    public void setupProducts(){
        Product Product1 = new Product();
        Product1.setBrand("asdf");
        Product1.setCategory("Marmelade");
        Product1.setSubcategory("Erbeermarmelade");
        Product1.setCooling(false);
        Product1.setName("Marmelde");
        Product1.setPrice(247);
        
        Product Product2 = new Product();
        Product2.setBrand("qwer");
        Product2.setCategory("Käse");
        Product2.setSubcategory("Gouda");
        Product2.setCooling(true);
        Product2.setName("Käse");
        Product2.setPrice(149);
        
        Product Product3 = new Product();
        Product3.setBrand("yxcv");
        Product3.setCategory("Wurst");
        Product3.setSubcategory("Leberwurst");
        Product3.setCooling(true);
        Product3.setName("Wurst");
        Product3.setPrice(199);
        
        Products.add(Product1);
        Products.add(Product2);
        Products.add(Product3);
    }

    public List<Product> viewAllProducts() {
        return Products;
    }

	public List<Category> filterCategories(List<Product> products)
	{
		//create new category list
		List<Category> categories = new ArrayList<Category>();
		//run over all products
		for(int i = 0; i < products.size(); i++)
		{
			//try to find current product's category in categories
			int index = findCategory(categories, products.get(i).getCategory());
			//if category doesn't exist create new category and add it to the list
			if(index < 0)
			{
				Category temp = new Category();
				temp.setName(products.get(i).getCategory());
				List<Product> templist = new ArrayList<Product>();
				templist.add(products.get(i));
				temp.setItems(templist);
				categories.add(temp);
			}
			//if it does exist, add the item to the category
			else
			{
				List<Product> tempprods = categories.get(index).getItems();
				tempprods.add(products.get(i));
				categories.get(index).setItems(tempprods);
			}
		}
		return categories;
	}

	public int findCategory(List<Category> cats, String name)
	{
		for(int i = 0; i < cats.size(); i++)
		{
			if(cats.get(i).matchesString(name))
			{
				return i;
			}
		}
		return -1;
	}
}
