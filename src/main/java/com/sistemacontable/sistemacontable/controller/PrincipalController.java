package com.sistemacontable.sistemacontable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.sistemacontable.sistemacontable.userdata.User;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PrincipalController {
    @GetMapping(value = "/index")
    public String getIndex(){
        return "index.html";
    }

    @PostMapping(value = "/Dashboard")
    public String Dashboard(@ModelAttribute User user){
        System.out.println(user.getUsername() + ": " + user.getPassword());
        return "redirect:/Dashboard.html";
    }
}
