package com.sistemacontable.sistemacontable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalController {
    @RequestMapping(value = "index")
    public String Principal(){
        return "index";
    }
}
