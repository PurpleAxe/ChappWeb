package com.visagie.chappweb.controllers;


import com.visagie.chappweb.models.Child;
import com.visagie.chappweb.repos.IChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private IChildrenRepository childrenRepository;

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/home")
    public String getHome(Model model, Child child){
        List<Child> childList = childrenRepository.findAll();
        child = childList.get(childList.size() - 1);
        model.addAttribute("usrname", child.getName());
        model.addAttribute("users", childList);
        return "home";
    }

}
