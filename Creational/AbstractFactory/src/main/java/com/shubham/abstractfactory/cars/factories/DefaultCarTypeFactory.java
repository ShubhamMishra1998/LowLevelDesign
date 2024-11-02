package com.shubham.abstractfactory.cars.factories;

public class DefaultCarTypeFactory implements CarTypeFactory {
    @Override
    public CarFactory getCarFactory(String whichFactory) {
        if(whichFactory.equalsIgnoreCase("Ordinary")) {
            return new OrdinaryCarFactory();
        } else if (whichFactory.equalsIgnoreCase("Modern")) {
            return new ModernCarFactory();
        }
        return null;
    }
}
