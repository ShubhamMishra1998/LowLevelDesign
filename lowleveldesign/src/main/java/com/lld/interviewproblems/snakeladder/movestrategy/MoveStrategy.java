package com.lld.interviewproblems.snakeladder.movestrategy;

import com.lld.interviewproblems.snakeladder.entities.Cell;
import com.lld.interviewproblems.snakeladder.entities.Piece;

public interface MoveStrategy {
    void movePiece(String name, Piece piece, Cell[][] board);
}
