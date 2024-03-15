package FactoryPattern.Car;

import FactoryPattern.Body.Body;
import FactoryPattern.CoolingSystem.CoolingSystem;
import FactoryPattern.Engine.Engine;
import FactoryPattern.FuelSystem.FuelSystem;
import FactoryPattern.Wheel.Wheel;

public abstract class   Car {
    private Body body;
    private CoolingSystem coolingSystem;
    private Engine engine;
    private FuelSystem fuelSystem;
    private Wheel wheel;

    public Car(Body body, CoolingSystem coolingSystem, Engine engine, FuelSystem fuelSystem, Wheel wheel) {
        this.body = body;
        this.coolingSystem = coolingSystem;
        this.engine = engine;
        this.fuelSystem = fuelSystem;
        this.wheel = wheel;
    }

    // Another methods
}
