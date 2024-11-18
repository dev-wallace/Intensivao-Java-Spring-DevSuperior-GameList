package com.devwallace.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devwallace.listgames.dto.GameListDTO;
import com.devwallace.listgames.dto.GameMinDTO;
import com.devwallace.listgames.services.GameListService;
import com.devwallace.listgames.services.GameService;

@RestController
@RequestMapping (value = "/lists")

public class GameListController {

            @Autowired
        private GameListService gameListService;
        
        @Autowired
        private GameService gameService;

        @GetMapping
    public List<GameListDTO> findAll(){

        var result = gameListService.findAll();
        return result;

    }


    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){

        List<GameMinDTO> result = gameService.findByList(listId);
        return result;

    }

}
