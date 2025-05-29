package com.lld.interviewproblems.snakeladder;

import com.lld.interviewproblems.snakeladder.game.Game;
import com.lld.interviewproblems.snakeladder.game.SnakeLaddarGame;

public class Main {
    public static void main(String[] args) {
        Game game = new SnakeLaddarGame(10, 10);
        game.play();
    }
}
