package com.gagan.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

/*
    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
*/

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
