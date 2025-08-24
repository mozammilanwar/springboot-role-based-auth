package com.example.SpringSecuirityy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Contoller {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/admin/home")
    public String AdminHandle(){
        return "admin_home";
    }
    @GetMapping("/user/home")
    public String UsedHandle(){
        return "user_home";
    }
}
