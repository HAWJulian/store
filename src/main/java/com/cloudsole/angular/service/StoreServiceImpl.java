package com.cloudsole.angular.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

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
}
