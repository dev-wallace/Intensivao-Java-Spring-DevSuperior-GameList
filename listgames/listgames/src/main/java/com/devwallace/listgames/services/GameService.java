package com.devwallace.listgames.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devwallace.listgames.dto.GameDTO;
import com.devwallace.listgames.dto.GameMinDTO;
import com.devwallace.listgames.entities.Game;
import com.devwallace.listgames.repositories.GameRepository;

@Service
public class GameService {

@Autowired
private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();

        GameDTO dto = new GameDTO(result);

        return dto;

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){

        var result = gameRepository.findAll();

        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;

    }

}
