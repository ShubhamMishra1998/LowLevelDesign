package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.GameStatus;
import com.lld.interviewproblems.tictactoe.util.GameUtil;

public class TickTackToeBoardGame implements BoardGame{
    private final Player playerX;
    private final Player playerY;
    private final Board board;
    int count;
    GameStatus gameStatus;

    public TickTackToeBoardGame(Player playerX, Player playerY, Board board) {
        this.playerX = playerX;
        this.playerY = playerY;
        this.board = board;
    }

    @Override
    public void play() {
        board.printBoard();

        while(count < board.getDimensions()) {
            if(count % 2 == 0) {
                boolean isGameExited = playerX.makeMove(board, playerX);
                if(isGameExited) {
                    gameStatus = GameStatus.Exit;
                    break;
                }
                if(GameUtil.isPlayerWon(board.getBoard(), playerX.getSymbol())) {
                    gameStatus = GameStatus.PlayerXWon;
                    break;
                }

            } else {
                boolean isGameExited = playerY.makeMove(board, playerY);
                if(isGameExited) {
                    gameStatus = GameStatus.Exit;
                    break;
                }
                if(GameUtil.isPlayerWon(board.getBoard(), playerY.getSymbol())) {
                    gameStatus = GameStatus.PlayerYWon;
                    break;
                }

            }
            count++;
        }

        if(gameStatus == GameStatus.PlayerXWon || gameStatus == GameStatus.PlayerYWon) {
            String playerName = gameStatus == GameStatus.PlayerXWon ? playerX.getName() : playerY.getName();
            System.out.println(playerName + " won the game");
        } else {
            if(count == board.getDimensions()) {
                System.out.println("Game Over");
            }
        }

    }
}
