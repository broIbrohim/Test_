package com.I;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {

    @GetMapping("")
//Thyme f
    public String showHomePace () {
        return "index";

    }
}
