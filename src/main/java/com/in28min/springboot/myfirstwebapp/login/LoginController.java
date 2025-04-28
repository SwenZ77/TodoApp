//package com.in28min.springboot.myfirstwebapp.login;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.*;
//
//
//@Controller
//@SessionAttributes("name")
//public class LoginController {
//
////    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    @GetMapping("login")
//    public String goToLogin(){
////        LOGGER.info("name is {} ",name); // not for prod code
////        modelMap.put("name",name);
//        return "loginPage";
//    }
//
//    @PostMapping("login")
//    public String goToWelcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
//        modelMap.put("name", name);
//        modelMap.put("password", password);
//        if (authenticationService.checkUser(name, password)) {
//            return "welcome";
//        }
//        return "errorPage";
//    }
//
//    @RequestMapping("home")
//    public String goToHome(ModelMap modelMap){
//        if(modelMap.containsKey("name")){
//            return "welcome";
//        }
//        return "errorPage";
//    }
//
//
//}
