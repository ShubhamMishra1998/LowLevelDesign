package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.Symbol;

public interface Board {
    void initialize();
    boolean isValidMove(Position position);
    void putValueInBoard(Position position, Symbol symbol);
    void printBoard();
    int getDimensions();
    Symbol[][] getBoard();
}
