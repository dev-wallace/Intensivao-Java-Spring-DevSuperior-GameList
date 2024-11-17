package com.devwallace.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devwallace.listgames.entities.Game;
/*dentro do genric vai o o tipo da entidade e o tipo do seu id 
 * 
 * o Repository vai somente fazer consultas no banco quem faz as operacoes e a camada de servico 
*/
public interface GameRepository extends JpaRepository<Game,Long>{

}
