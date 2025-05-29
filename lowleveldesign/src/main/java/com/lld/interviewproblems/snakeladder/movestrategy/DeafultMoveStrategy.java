package com.lld.interviewproblems.snakeladder.movestrategy;

import com.lld.interviewproblems.snakeladder.entities.Cell;
import com.lld.interviewproblems.snakeladder.entities.Piece;
import com.lld.interviewproblems.snakeladder.entities.Position;
import com.lld.interviewproblems.snakeladder.util.GameUtil;

import java.util.Random;

public class DeafultMoveStrategy implements MoveStrategy {
    private final Random random = new Random();
    @Override
    public void movePiece(String name, Piece piece, Cell[][] board) {
       int diceValue = random.nextInt(0,6)+1;
       int initialPosition = piece.getPosition();
       int targetPosition = piece.getPosition();
       if (piece.getPosition() + diceValue <= 100) {
           targetPosition = getNewPosition(piece.getPosition() + diceValue, board);
           piece.setPosition(targetPosition);
       }
        System.out.println(name + " rolled a " + diceValue + " and moved from " + initialPosition + " to " + targetPosition);
    }

    private int getNewPosition(int value, Cell[][] board) {

        Position position = GameUtil.getCellPosition(value-1, board[0].length);
        Cell cell = board[position.getR()][position.getC()];
        if(cell.hasSnakeHead()) {
            return cell.getSnakeTailPosition();
        } else if(cell.isHasLadderTail()) {
            return cell.getLadderHeadPosition();
        }  else {
            return value;
        }
    }
}
