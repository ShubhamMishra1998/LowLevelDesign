package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.Symbol;

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerStrategy strategy;

    public Player(String name, Symbol symbol, PlayerStrategy strategy) {
        this.name = name;
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public boolean makeMove(Board board, Player player) {
        return strategy.makeMove(board, player.getSymbol());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PlayerStrategy strategy) {
        this.strategy = strategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
