package com.example.DTO;

import com.example.domain.Player;
import com.example.enums.GameType;
import com.example.enums.Piece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private int id;
    private GameType gameType;
    private Piece piece;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "id=" + id +
                ", gameType=" + gameType +
                ", piece=" + piece +
                '}';
    }
}


