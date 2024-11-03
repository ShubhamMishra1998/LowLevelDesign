package com.shubham.tictaktoe;

import com.shubham.tictaktoe.entities.Cell;
import com.shubham.tictaktoe.entities.CellO;
import com.shubham.tictaktoe.entities.CellX;
import com.shubham.tictaktoe.enums.SymbolType;

public class CellFactory {

    public Cell getCell(SymbolType symbolType) {
        return switch (symbolType) {
            case X -> new CellX(SymbolType.X);
            case O -> new CellO(SymbolType.O);
        };

    }
}
