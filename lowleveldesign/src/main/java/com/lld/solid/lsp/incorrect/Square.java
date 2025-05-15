package com.lld.solid.lsp.incorrect;

/**
 * The Square class overrides the behavior of Rectangle in a way that violates LSP.
 * When a Square is treated polymorphically as its base class Rectangle, it produces unexpected behavior: the height automatically adjusts to match the width, leading to incorrect area calculations.
 * If the client code relies on the behavior of Rectangle, the contract is broken when substituting it with Square.
 */
public class Square extends Rectangle {

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
