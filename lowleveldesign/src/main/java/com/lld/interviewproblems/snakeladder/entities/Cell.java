package com.lld.interviewproblems.snakeladder.entities;

public class Cell {
    private int cellNumber;
    private boolean hasSnakeHead;
    private boolean hasLadderTail;
    private int snakeTailPosition;
    private int ladderHeadPosition;

    public Cell (int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public boolean hasSnakeHead() {
        return hasSnakeHead;
    }

    public void setHasSnakeHead(boolean hasSnakeHead) {
        this.hasSnakeHead = hasSnakeHead;
    }

    public boolean isHasLadderTail() {
        return hasLadderTail;
    }

    public void setHasLadderTail(boolean hasLadderTail) {
        this.hasLadderTail = hasLadderTail;
    }

    public int getSnakeTailPosition() {
        return snakeTailPosition;
    }

    public void setSnakeTailPosition(int snakeTailPosition) {
        this.snakeTailPosition = snakeTailPosition;
    }

    public int getLadderHeadPosition() {
        return ladderHeadPosition;
    }

    public void setLadderHeadPosition(int ladderHeadPosition) {
        this.ladderHeadPosition = ladderHeadPosition;
    }
}
