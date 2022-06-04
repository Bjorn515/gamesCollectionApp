package com.example.projekt.controllers;

import com.example.projekt.services.gamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.projekt.models.users;
import com.example.projekt.services.usersService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class usersControl {


    @Autowired
    private usersService service;

    @GetMapping("/wylogowano")
    public String wylogowano(){
        return "wylogowano";
    }

    @RequestMapping("/login")
    public String loginForm(Model model) {
        users user = new users();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping(value="/login")
    public String logincheck(@ModelAttribute("user") users user) {
        Optional<users> user2= service.findById(user.getId());

        return "redirect:/";
    }

    @GetMapping("/register")
    public String newUser(Model model)
    {
        users user = new users();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping(value="/register")
    public String addNewUser(@ModelAttribute("user") users user) {
        service.save(user);
        return "redirect:/login";
    }
}
