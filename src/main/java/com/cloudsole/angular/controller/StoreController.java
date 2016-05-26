package com.cloudsole.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudsole.angular.model.Category;
import com.cloudsole.angular.model.Product;
import com.cloudsole.angular.model.Result;
import com.cloudsole.angular.service.StoreService;

/**
 * Created by tmichels on 8/4/14.
 */

@Controller
@RequestMapping("/store")
public class StoreController
{

	@Autowired
	StoreService storeservice;

	@RequestMapping(value = "/all.json", method = RequestMethod.GET, produces = { "application/json; charset=UTF-8" })
	public @ResponseBody Result viewAllProducts()
	{
		List<Product> tempproducts = storeservice.viewAllProducts();
		List<Category> tempcats = storeservice.filterCategories(tempproducts);
		Result result = new Result();
		result.setCategories(tempcats);
		result.setProducts(tempproducts);
		return result;
	}
	/*
	 * @RequestMapping(value = "/categories.json", method = RequestMethod.GET,
	 * produces={"application/json; charset=UTF-8"}) public @ResponseBody
	 * List<Product> viewAllCategories(){
	 * 
	 * }
	 */

	@RequestMapping("/layout")
	public String layout()
	{
		return "store/layout";
	}
	// return all items from db

}
