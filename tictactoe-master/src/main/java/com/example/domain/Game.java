package com.example.domain;

import com.example.enums.GameStatus;
import com.example.enums.GameType;
import com.example.enums.Piece;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Entity
@Check(constraints = "first_player_piece_code = 'O' or first_player_piece_code = 'X' " +
        "and game_type = 'COMPUTER' or game_type = 'COMPETITION' " +
        "and game_status = 'IN_PROGRESS' or game_status = 'FIRST_PLAYER_WON' or game_status = 'SECOND_PLAYER_WON'" +
        "or game_status = 'TIE' or game_status = 'WAITS_FOR_PLAYER' ")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "second_player_id", nullable = true)
    private Player secondPlayer;

    @ManyToOne
    @JoinColumn(name = "first_player_id", nullable = false)
    private Player firstPlayer;

    @Enumerated(EnumType.STRING)
    private Piece firstPlayerPieceCode;

    @Enumerated(EnumType.STRING)
    private GameType gameType;

    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;

    @Column(name = "created", nullable = false)
    private Date created;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public Piece getFirstPlayerPieceCode() {
        return firstPlayerPieceCode;
    }

    public void setFirstPlayerPieceCode(Piece firstPlayerPieceCode) {
        this.firstPlayerPieceCode = firstPlayerPieceCode;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) &&
                Objects.equals(secondPlayer, game.secondPlayer) &&
                Objects.equals(firstPlayer, game.firstPlayer) &&
                firstPlayerPieceCode == game.firstPlayerPieceCode &&
                gameType == game.gameType &&
                gameStatus == game.gameStatus &&
                Objects.equals(created, game.created);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, secondPlayer, firstPlayer, firstPlayerPieceCode, gameType, gameStatus, created);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", secondPlayer=" + secondPlayer +
                ", firstPlayer=" + firstPlayer +
                ", firstPlayerPieceCode=" + firstPlayerPieceCode +
                ", gameType=" + gameType +
                ", gameStatus=" + gameStatus +
                ", created=" + created +
                '}';
    }
}
