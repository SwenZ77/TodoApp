package com.in28min.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

//@Service
public class AuthenticationService{
    private String name;
    private String password;

    boolean checkUser(String n,String p){
        return (n.equals("Swayam") && p.equals("abcd")) || (n.equals("Rasik") && p.equals("1234"));
    }
}
