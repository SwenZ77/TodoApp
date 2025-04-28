package com.in28min.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are we learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Say Hello HTML</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>My First Heading</h1>");
        sb.append("<p>My first paragraph.</p>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    //localhost:8081/say-hello-jsp => sayHelloPage.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHelloPage";
    }
}
