package com.example.repository;

import com.example.domain.Game;
import com.example.domain.Player;
import com.example.enums.GameStatus;
import com.example.enums.GameType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Repository
public interface GameRepository extends CrudRepository<Game, Long>{
    List<Game> findByGameTypeAndGameStatus(GameType GameType, GameStatus GameStatus);
    List<Game> findByGameStatus(GameStatus gameStatus);
}
