package com.shubham.tictaktoe;

import com.shubham.tictaktoe.entities.Board;
import com.shubham.tictaktoe.entities.Player;
import com.shubham.tictaktoe.entities.PlayerX;
import com.shubham.tictaktoe.entities.PlayerY;
import com.shubham.tictaktoe.enums.SymbolType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players = new ArrayDeque();
    Scanner sc;

    public Game(int size) {
        this.board = new Board(size);
        Player playerX = new PlayerX("Player X", SymbolType.X);
        Player playerY = new PlayerY("Player O", SymbolType.O);
        players.add(playerX);
        players.add(playerY);
        sc = new Scanner(System.in);
    }

    public String startGame() {
        boolean isWinner = true;
        while (isWinner) {
            boolean isFreeCellAvailable = board.isFreeCellAvailable();
            if(!isFreeCellAvailable) {
                isWinner = false;
                continue;
            }
            board.printBoard();
            Player player = players.removeFirst();
            System.out.println("Player "+player.getName()+" is making  the move");
            String input = sc.nextLine();
            String[] vals = input.split(",");
            int row = Integer.parseInt(vals[0]);
            int col = Integer.parseInt(vals[1]);
            if (!board.addSymbol(row, col, player.getSymbolType())) {
                System.out.println("Wrong Move Please Try Again !!!");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean isWinner1 = isWinner(row,col,player.getSymbolType());
            if(isWinner1){
                return player.getName();
            }

        }

        return "TIE";
    }

    public boolean isWinner(int row,int column,SymbolType cellType){
        boolean isrow = true;
        boolean isColumn = true;
        boolean isDiagonal = true;
        boolean isAntiDiagonal = true;
        for(int i = 0;i<board.size;i++){
            if(board.board[row][i] == null || board.board[row][i].getSymbolType() != cellType){
                isrow = false;
            }
        }
        for(int i = 0;i<board.size;i++){
            if(board.board[i][column] == null || board.board[i][column].getSymbolType() != cellType){
                isColumn = false;
            }
        }
        for(int i = 0,j=0;i<board.size;i++,j++){
            if(board.board[i][j] == null || board.board[i][j].getSymbolType() != cellType){
                isDiagonal = false;
            }
        }
        for(int i = 0,j= board.size-1;i< board.size;i++,j--){
            if(board.board[i][j] == null || board.board[i][j].getSymbolType() != cellType){
                isAntiDiagonal = false;
            }
        }
        return isrow || isColumn || isDiagonal || isAntiDiagonal;
    }
}
