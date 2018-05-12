package com.example.domain;


import java.util.Objects;

/**
 * Author : Mohamed Riyas on 12-05-2018
 */

public class Position {
    int boardRow;
    int boardColumn;

    public Position(int boardRow, int boardColumn) {
        this.boardRow = boardRow;
        this.boardColumn = boardColumn;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return getBoardRow() == position.getBoardRow() &&
                getBoardColumn() == position.getBoardColumn();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBoardRow(), getBoardColumn());
    }

    @Override
    public String toString() {
        return "Position{" +
                "boardRow=" + boardRow +
                ", boardColumn=" + boardColumn +
                '}';
    }
}
