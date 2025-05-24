package com.lld.interviewproblems.tictactoe.util;

public class GameUtil {
    public static boolean isPlayerWon(Symbol[][] board, Symbol symbol) {

        //row  wise
        for (Symbol[] symbols : board) {
            int count = 0;
            for (int j = 0; j < board[0].length; j++) {
                if (symbols[j].getSymbolValue() == symbol.getSymbolValue()) {
                    count++;
                }
            }
            if (count == board[0].length) return true;
        }

        //col wise
        for(int i=0;i<board[0].length;i++) {
            int count = 0;
            for(int j=0;j<board.length;j++) {
                if (board[j][i].getSymbolValue() == symbol.getSymbolValue()) {
                    count++;
                }
            }
            if (count == board.length) return true;
        }

        // diagonal
        int count = 0;
        for(int i=0,j=0;i<board.length;i++,j++) {
            if (board[i][j].getSymbolValue() == symbol.getSymbolValue()) {
                count++;
            }
        }
        if (count == board.length) return true;
        count = 0;

        //anti diagonal
        for(int i=0,j=board.length-1;i<board.length;i++,j--) {
            if (board[i][j].getSymbolValue() == symbol.getSymbolValue()) {
                count++;
            }
        }
        return count == board.length;
    }
}
