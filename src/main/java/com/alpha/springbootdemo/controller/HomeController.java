package com.alpha.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller// Controllers annotated with @Controller returns a template name
//@ResponseBody  This annotation makes controller return a response body instead of a viw view name
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("date", new java.util.Date());
        return "home";
    }


}
