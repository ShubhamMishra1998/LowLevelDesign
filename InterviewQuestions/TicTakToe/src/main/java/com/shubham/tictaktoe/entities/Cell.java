package com.shubham.tictaktoe.entities;

import com.shubham.tictaktoe.enums.SymbolType;

public abstract class Cell {
    SymbolType symbolType;

    public Cell(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(SymbolType symbolType) {
        this.symbolType = symbolType;
    }
}
