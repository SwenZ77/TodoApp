package com.in28min.springboot.myfirstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/logout")
public class LogoutController {

    @GetMapping
    public String logoutPageShow(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "logoutPage";
    }

}
