package com.example.repository;

import com.example.domain.Game;
import com.example.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    Player findOneByUserName(String userName);
}
