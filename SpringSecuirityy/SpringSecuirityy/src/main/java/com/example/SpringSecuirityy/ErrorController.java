package com.example.SpringSecuirityy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/403")
    public String accessDenied() {
        return "403";  // points to 403.html
    }
    @GetMapping("/404")
    public String PageNotFound() {
        return "404";  // points to 403.html
    }
}