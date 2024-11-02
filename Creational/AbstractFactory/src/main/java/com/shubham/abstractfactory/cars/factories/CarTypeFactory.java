package com.shubham.abstractfactory.cars.factories;

public interface CarTypeFactory {
    CarFactory getCarFactory(String whichFactory);
}
