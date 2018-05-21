package com.gagan.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String username, String password) {
     return (username.equals("user") && password.equals("user")) ? true : false;
    }
}
