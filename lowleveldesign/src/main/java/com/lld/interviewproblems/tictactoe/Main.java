package com.lld.interviewproblems.tictactoe;

import com.lld.interviewproblems.tictactoe.entities.*;
import com.lld.interviewproblems.tictactoe.util.Symbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        Player playerX = new Player(inputs[1], Symbol.X, new HumanStrategy());
        input = sc.nextLine();
        inputs = input.split(" ");
        Player playerY = new Player(inputs[1], Symbol.O, new HumanStrategy());
        Board board = new TicTacToeBoard(3, 3);

        BoardGame game = new TickTackToeBoardGame(playerX, playerY, board);
        game.play();

    }
}
