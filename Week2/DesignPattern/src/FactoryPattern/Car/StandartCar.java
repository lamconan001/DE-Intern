package FactoryPattern.Car;

import FactoryPattern.Body.Body;
import FactoryPattern.Car.Car;
import FactoryPattern.CoolingSystem.CoolingSystem;
import FactoryPattern.Engine.Engine;
import FactoryPattern.FuelSystem.FuelSystem;
import FactoryPattern.Wheel.Wheel;

public class StandartCar extends Car {
    public StandartCar(Body body, CoolingSystem coolingSystem, Engine engine, FuelSystem fuelSystem, Wheel wheel) {
        super(body, coolingSystem, engine, fuelSystem, wheel);
    }
}
