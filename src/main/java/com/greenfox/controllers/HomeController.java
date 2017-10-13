package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Controller
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(Model model){
        return "redirect:/recipes";
    }
}