package com.cloudsole.angular.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.cloudsole.angular.model.Item;
@Service
public class StoreServiceImpl
{
	List<Item> items = new ArrayList<Item>();
    private static Long id = 0L;
    //TODO: get items from database
    
    @PostConstruct
    public void setupItems(){
        Item item1 = new Item();
        item1.setBrand("asdf");
        item1.setCategory("Marmelade");
        item1.setSubcategory("Erbeermarmelade");
        item1.setCooling(false);
        item1.setName("Marmelde");
        item1.setPrice(247);
        
        Item item2 = new Item();
        item2.setBrand("qwer");
        item2.setCategory("Käse");
        item2.setSubcategory("Gouda");
        item2.setCooling(true);
        item2.setName("Käsa");
        item2.setPrice(149);
        
        Item item3 = new Item();
        item3.setBrand("yxcv");
        item3.setCategory("Wurst");
        item3.setSubcategory("Leberwurst");
        item3.setCooling(true);
        item3.setName("Wurst");
        item3.setPrice(199);
        
        items.add(item1);
        items.add(item2);
        items.add(item3);
    }

    public List<Item> viewAllItems() {
        return items;
    }
}
