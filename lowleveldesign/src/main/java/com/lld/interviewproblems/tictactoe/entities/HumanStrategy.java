package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.Symbol;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy {

    @Override
    public boolean makeMove(Board board, Symbol symbol) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        do {
            String input = sc.nextLine();
            if (isGameExitPressed(input)) return true;

            String[] vals = input.split(" ");
            row = Integer.parseInt(vals[0])-1;
            col = Integer.parseInt(vals[1])-1;
        } while (!board.isValidMove(new Position(row, col)));

        board.putValueInBoard(new Position(row, col), symbol);
        board.printBoard();

        return false;
    }

    private boolean isGameExitPressed(String input) {
        return input.equalsIgnoreCase("Exit");
    }
}
