package com.example.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateMoveDTO {
    @NotNull
    int boardRow;
    @NotNull
    int boardColumn;

    public int getBoardRow() {
        return boardRow;
    }

    public void setBoardRow(int boardRow) {
        this.boardRow = boardRow;
    }

    public int getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(int boardColumn) {
        this.boardColumn = boardColumn;
    }

    @Override
    public String toString() {
        return "CreateMoveDTO{" +
                "boardRow=" + boardRow +
                ", boardColumn=" + boardColumn +
                '}';
    }
}
