package com.example.projekt.controllers;

import com.example.projekt.ActUser;
import com.example.projekt.models.gamelist;
import com.example.projekt.models.users;
import com.example.projekt.repositories.gamesRep;
import com.example.projekt.request.GameRequest;
import com.example.projekt.services.gamelistService;
import com.example.projekt.services.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import com.example.projekt.models.games;
import com.example.projekt.services.gamesService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class gamesControl {

    @Autowired
    private gamesService service;
    @Autowired
    private gamelistService service2;
    @Autowired
    private com.example.projekt.services.usersService usersService;

    @GetMapping("/games")
    public String games(Model model) {
        List<games> games = service.findAll(Sort.by(Sort.Direction.ASC, "title"));
        model.addAttribute("games", games);
        return "games";
    }

    @GetMapping("/selectPlatform")
    public String platforms(Model model,@Param("platform") String platform) {
        List<games> games = service.findAllPlatform(platform);
        model.addAttribute("games", games);
        return "games";
    }


    @GetMapping("/search")
    public String search(@Param("search") String search, Model model) {

        List<games> searchGames = service.findByTitleContainingIgnoreCase(search);
        model.addAttribute("games", searchGames);
        return ("games");
    }

    @GetMapping("/addGame/{idg}")
    public String addGame(@PathVariable Long idg) {
        games game = service.findById(idg).get();
        users user = usersService.findById(ActUser.ActUsergetUserId()).get();
        System.out.println(user);
        gamelist relat = new gamelist();
        relat.setGames(game);
        relat.setUsers(user);
        relat.setPlaytime(0);

        List<gamelist> connections = service2.findAll();

        if(connections.contains(relat)){
            return "redirect:/games";
        }
        else {
            service2.save(relat);
            return "redirect:/gamelist";
        }
    }

    /*@GetMapping("/addGame/{idg}")
    public String addGame(@PathVariable Long idg) {
        games game = service.findById(idg).get();
        users user = usersService.findById(ActUser.getUserId()).get();
        System.out.println(user);
        gamelist relat = new gamelist();
        relat.setGames(game);
        relat.setUsers(user);
        relat.setPlaytime(0);
        System.out.println(relat);
        service2.save(relat);
        return "redirect:/games";
    }*/
}
