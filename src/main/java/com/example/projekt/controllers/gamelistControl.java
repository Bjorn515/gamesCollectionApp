package com.example.projekt.controllers;

import com.example.projekt.ActUser;
import com.example.projekt.models.relationship;
import com.example.projekt.models.users;
import com.example.projekt.services.gamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import com.example.projekt.models.gamelist;
import com.example.projekt.services.gamelistService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class gamelistControl {

    @Autowired
    private gamelistService service;

    @GetMapping("/gamelist")
    public String gamelist(Model model)
    {
        int suma = 0;
        int sumaGier = 0;
        users u = new users();
        u.setId(ActUser.ActUsergetUserId());
        List<gamelist> gamelist = service.findAllByUsersOrderByPlaytimeDesc(u);
        for ( gamelist g : gamelist) {
            suma += g.getPlaytime();
            sumaGier++;
        }
        model.addAttribute("gamelist", gamelist);
        model.addAttribute("suma",suma);
        model.addAttribute("sumaGier",sumaGier);
        return "/gamelist";
    }

    @GetMapping("/deleteByIdl/{idl}")
    public String deleteByIdl(@PathVariable Long idl)
    {
        service.deleteByIdl(idl);
        return "redirect:/gamelist";
    }
    @GetMapping("/updatePlaytime")
    public String uPT(@Param("idl") Long idl,@Param("playtime") Integer playtime){
        gamelist gl = service.findByIdl(idl);
        gl.setPlaytime(playtime);
        service.save(gl);
        return "redirect:/gamelist";
    }


}
