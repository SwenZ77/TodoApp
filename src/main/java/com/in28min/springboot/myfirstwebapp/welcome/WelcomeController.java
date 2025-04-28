package com.in28min.springboot.myfirstwebapp.welcome;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @GetMapping("/")
    public String getWelcomePage(ModelMap modelMap){
        modelMap.put("name",getLoggedInUser());
        return "welcome";
    }

    private String getLoggedInUser() {
        return SecurityContextHolder.getContext().
                getAuthentication().getName();
    }

    @RequestMapping("home")
    public String goToHome(ModelMap modelMap){
        if(modelMap.containsKey("name")){
            return "welcome";
        }
        return "errorPage";
    }
}
