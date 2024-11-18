package com.devwallace.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devwallace.listgames.entities.GameList; 

public interface GameListRepository extends JpaRepository<GameList, Long> {
 
}
