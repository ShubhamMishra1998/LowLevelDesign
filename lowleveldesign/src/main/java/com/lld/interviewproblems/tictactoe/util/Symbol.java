package com.lld.interviewproblems.tictactoe.util;

public enum Symbol {
    X('X'),
    O('O'),
    BLANK('-');

    private char symbolValue;

    Symbol(char symbol) {
        this.symbolValue = symbol;
    }

    @Override
    public String toString() {
        return symbolValue +"";
    }

    public char getSymbolValue() {
        return symbolValue;
    }

    public void setSymbolValue(char symbolValue) {
        this.symbolValue = symbolValue;
    }
}
