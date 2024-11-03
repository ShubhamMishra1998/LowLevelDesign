package com.shubham.tictaktoe.entities;

import com.shubham.tictaktoe.CellFactory;
import com.shubham.tictaktoe.enums.SymbolType;

public class Board {
    public  int size;
    public Cell[][] board;
    CellFactory cellFactory;

    public Board(int size) {
        this.size = size;
        this.board = new Cell[size][size];
        cellFactory  = new CellFactory();
    }

    public boolean isFreeCellAvailable() {
       for(int i=0;i<size;i++) {
           for(int j=0;j<size;j++) {
               if(board[i][j] == null) {
                   return true;
               }
           }
       }
       return false;
    }

    public boolean addSymbol(int row, int col, SymbolType symbolType) {
        if(board[row][col] == null) {
            board[row][col] = cellFactory.getCell(symbolType);
            return true;
        }
        return false;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j].getSymbolType().name()+" ");
                } else {
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
