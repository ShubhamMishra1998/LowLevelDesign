package com.shubham.tictaktoe.entities;

import com.shubham.tictaktoe.enums.SymbolType;

public abstract class Player {

    private String name;
    SymbolType symbolType;

    public Player(String name, SymbolType symbolType) {
        this.name = name;
        this.symbolType = symbolType;
    }

    public String getName() {
        return name;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }
}
