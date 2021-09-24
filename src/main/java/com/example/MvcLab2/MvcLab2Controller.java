package com.example.MvcLab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcLab2Controller {
    @GetMapping("/")
    public String index(){

        return "index";
    }

}
