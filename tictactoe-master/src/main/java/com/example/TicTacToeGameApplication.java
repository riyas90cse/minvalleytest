package com.example;

import com.example.domain.Player;
import com.example.repository.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class TicTacToeGameApplication {


	public static void main(String[] args) {

		SpringApplication.run(TicTacToeGameApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(PlayerRepository playerRepository) {
        return (args) -> {

            //save a couple of players
            playerRepository.save(new Player("mohamed", "mohamed@mohamed.com", new BCryptPasswordEncoder().encode("mohamed")));
            playerRepository.save(new Player("player1", "player1@player.com",  new BCryptPasswordEncoder().encode("player1")));

        };
    }

}
