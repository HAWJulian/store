package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 5:27 PM
 */
@Controller
@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
public class IndexController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String getIndexPage() {
        return "index";
    }
}
