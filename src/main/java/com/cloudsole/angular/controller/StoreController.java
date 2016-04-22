package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tmichels on 8/4/14.
 */

@Controller
@RequestMapping("/store")
public class StoreController {

    @RequestMapping("/layout")
    public String layout(){
        return "store/layout";
    }
    //return all items from db

}
