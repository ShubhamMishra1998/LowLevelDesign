package com.lld.interviewproblems.snakeladder.entities;

import com.lld.interviewproblems.snakeladder.movestrategy.MoveStrategy;

public class Player {
    private String name;
    private Piece piece;
    private MoveStrategy moveStrategy;

    public Player(String name, MoveStrategy moveStrategy) {
        this.name = name;
        this.moveStrategy = moveStrategy;
        this.piece = new Piece(0);
    }

    public void makeMove(Cell[][] board) {
        if (!hasWon()) {
            moveStrategy.movePiece(name, piece, board);
            if(hasWon()) {
                System.out.println(name+ " wins the game");
            }
        }
    }

    public boolean hasWon() {
        return piece.getPosition() == 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
