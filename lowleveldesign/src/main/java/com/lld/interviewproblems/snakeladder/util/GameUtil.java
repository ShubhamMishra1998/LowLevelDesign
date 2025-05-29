package com.lld.interviewproblems.snakeladder.util;

import com.lld.interviewproblems.snakeladder.entities.Cell;
import com.lld.interviewproblems.snakeladder.entities.Position;

public class GameUtil {
    public static void inililizeBoard(Cell[][] board, int r, int c) {
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                board[i][j] = new Cell((i+1) * (j+1));
            }
        }
    }

    public static Position getCellPosition(int position, int col) {
        int r =  position / col;
        int c = position % col;
        return new Position(r,c);
    }
}
