package com.devwallace.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devwallace.listgames.dto.GameMinDTO;
import com.devwallace.listgames.services.GameService;

@RestController
@RequestMapping (value = "/games")

public class GameController  {

        @Autowired
        private GameService gameService;
        
        @GetMapping
    public List<GameMinDTO> findAll(){

        var result = gameService.findAll();
        return result;

    }

}
