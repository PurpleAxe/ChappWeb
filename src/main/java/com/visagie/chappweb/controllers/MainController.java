package com.visagie.chappweb.controllers;


import com.visagie.chappweb.models.Child;
import com.visagie.chappweb.repos.IChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
    @Autowired
    private IChildrenRepository childrenRepository;

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

}
