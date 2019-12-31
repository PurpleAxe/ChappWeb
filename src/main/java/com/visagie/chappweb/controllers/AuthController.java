package com.visagie.chappweb.controllers;

import com.visagie.chappweb.models.Child;
import com.visagie.chappweb.repos.IChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @Autowired
    private IChildrenRepository childrenRepository;

    @RequestMapping("/login")
    public String getLogin(){
        return "login";
    }

    @RequestMapping("/addLogin")
    public String addLoginReq(Child child){
        childrenRepository.save(child);
        return("index");
    }
}
