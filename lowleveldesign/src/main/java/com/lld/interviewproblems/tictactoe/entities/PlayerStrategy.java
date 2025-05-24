package com.lld.interviewproblems.tictactoe.entities;

import com.lld.interviewproblems.tictactoe.util.Symbol;

public interface PlayerStrategy {
    boolean makeMove(Board player, Symbol board);
}
