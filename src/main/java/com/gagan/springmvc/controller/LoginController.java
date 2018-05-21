package com.gagan.springmvc.controller;

import com.gagan.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

/*
    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
*/

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String name,
                                     @RequestParam String password,
                                     ModelMap modelMap){
        boolean isValidUser = loginService.validateUser(name,password);
        if(!isValidUser) {
            modelMap.put("errrorMessage", "Invalid Username/password");
            return "login";
        }
        modelMap.put("name", name);
        return "welcome";

    }
}
