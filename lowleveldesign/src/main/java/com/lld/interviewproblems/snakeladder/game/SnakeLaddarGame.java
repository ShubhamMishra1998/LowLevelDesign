package com.lld.interviewproblems.snakeladder.game;

import com.lld.interviewproblems.snakeladder.entities.Cell;
import com.lld.interviewproblems.snakeladder.entities.Player;
import com.lld.interviewproblems.snakeladder.entities.Position;
import com.lld.interviewproblems.snakeladder.movestrategy.DeafultMoveStrategy;
import com.lld.interviewproblems.snakeladder.util.GameUtil;

import java.util.*;

public class SnakeLaddarGame implements Game {
    int row;
    int col;
    private Cell[][] board;
    private List<Player> players;
    private final Scanner sc = new Scanner(System.in);

    public SnakeLaddarGame(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new Cell[row][col];
        GameUtil.inililizeBoard(board, row, col);
        initializeSnakeLadderAndPlayers();
    }

    @Override
    public void play() {
        Set<Player> st =  new HashSet<>(players);
        int index = 0;
        while(st.size()>1) {
            Player player = players.get(index);
            player.makeMove(board);

            if(player.hasWon()) {
                st.remove(player);
            }

            index = (index+1) % players.size();
        }
        announceResults();
    }

    private void initializeSnakeLadderAndPlayers() {
        initializeSnakes();
        initializeLadders();
        initializePlayers();
    }

    private void initializeSnakes() {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String[] vals = sc.nextLine().split(" ");
            int head = Integer.parseInt(vals[0]);
            int tail = Integer.parseInt(vals[1]);
            Position position = GameUtil.getCellPosition(head-1, col);
            Cell cell = board[position.getR()][position.getC()];
            cell.setHasSnakeHead(true);
            cell.setSnakeTailPosition(tail);
        }
    }

    private void initializeLadders() {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String[] vals = sc.nextLine().split(" ");
            int tail = Integer.parseInt(vals[0]);
            int head = Integer.parseInt(vals[1]);
            Position position = GameUtil.getCellPosition(tail-1, col);
            Cell cell = board[position.getR()][position.getC()];
            cell.setHasLadderTail(true);
            cell.setLadderHeadPosition(head);
        }
    }

    private void initializePlayers() {
        int t = Integer.parseInt(sc.nextLine());
        this.setPlayers(new ArrayList<>());
        while(t-->0) {
            String name = sc.nextLine();
            Player player = new Player(name, new DeafultMoveStrategy());
            getPlayers().add(player);
        }
    }

    private void announceResults() {
        for(Player player : players) {
            if(player.hasWon()) {
                System.out.println(player.getName() + " WON");
            } else {
                System.out.println(player.getName() + " LOST");
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
