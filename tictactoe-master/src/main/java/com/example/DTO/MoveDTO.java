package com.example.DTO;

import com.example.enums.GameStatus;
import com.example.enums.Piece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MoveDTO {

    private int boardColumn;
    private int boardRow;
    private Date created;
    private String userName;
    private GameStatus gameStatus;
    private Piece playerPieceCode;

    public int getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(int boardColumn) {
        this.boardColumn = boardColumn;
    }

    public int getBoardRow() {
        return boardRow;
    }

    public void setBoardRow(int boardRow) {
        this.boardRow = boardRow;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Piece getPlayerPieceCode() {
        return playerPieceCode;
    }

    public void setPlayerPieceCode(Piece playerPieceCode) {
        this.playerPieceCode = playerPieceCode;
    }

    @Override
    public String toString() {
        return "MoveDTO{" +
                "boardColumn=" + boardColumn +
                ", boardRow=" + boardRow +
                ", created=" + created +
                ", userName='" + userName + '\'' +
                ", gameStatus=" + gameStatus +
                ", playerPieceCode=" + playerPieceCode +
                '}';
    }
}
