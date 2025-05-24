package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.Symbol;

public class TicTacToeBoard implements Board {
    int row;
    int col;
    Symbol[][] board;

    public TicTacToeBoard(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new Symbol[row][col];
        initialize();
    }

    @Override
    public void initialize() {
       for(int i=0;i<row;i++) {
           for(int j=0;j<col;j++) {
               board[i][j] = Symbol.BLANK;
           }
       }
    }

    @Override
    public boolean isValidMove(Position position) {
        if(position.getR() >= 0 && position.getR() < row
                && position.getC() >= 0 && position.getC() < col
                && board[position.getR()][position.getC()] == Symbol.BLANK) {
            return true;
        } else {
            System.out.println("Invalid Move");
            return false;
        }
    }

    @Override
    public void putValueInBoard(Position position, Symbol symbol) {
       board[position.getR()][position.getC()] = symbol;
    }

    @Override
    public void printBoard() {
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(board[i][j].toString()+" ");
            }
            System.out.println();
        }
    }

    @Override
    public int getDimensions() {
        return board[0].length * board.length;
    }

    @Override
    public Symbol[][] getBoard() {
        return this.board;
    }
}
