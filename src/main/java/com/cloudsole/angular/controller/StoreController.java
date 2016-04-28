package com.cloudsole.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudsole.angular.model.Item;
import com.cloudsole.angular.service.StoreService;

/**
 * Created by tmichels on 8/4/14.
 */

@Controller
@RequestMapping("/store")
public class StoreController {

	/*
	@Autowired
    StoreService storeservice;

    @RequestMapping(value = "/all.json", method = RequestMethod.GET)
    public @ResponseBody List<Item> viewAllItems(){
        return storeservice.viewAllItems();
    }
    */
    
    @RequestMapping("/layout")
    public String layout(){
        return "store/layout";
    }
    //return all items from db

}
