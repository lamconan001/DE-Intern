package FactoryPattern.Factory;

import FactoryPattern.Body.Body;
import FactoryPattern.Body.StandardBody;
import FactoryPattern.Car.Car;
import FactoryPattern.Car.StandartCar;
import FactoryPattern.CoolingSystem.CoolingSystem;
import FactoryPattern.CoolingSystem.StandardCoolingSystem;
import FactoryPattern.Engine.*;
import FactoryPattern.Factory.CarCreator;
import FactoryPattern.FuelSystem.FuelSystem;
import FactoryPattern.FuelSystem.StandartFuelSystem;
import FactoryPattern.Wheel.StandartWheel;
import FactoryPattern.Wheel.Wheel;

public class StandartCarCreator extends CarCreator {
    @Override
    public Car factoryMethod() {
        Body body = new StandardBody();
        Engine engine = new StandartEngine();
        CoolingSystem coolingSystem = new StandardCoolingSystem();
        FuelSystem fuelSystem = new StandartFuelSystem();
        Wheel wheel = new StandartWheel();
        return new StandartCar(body, coolingSystem, engine, fuelSystem, wheel);
    }
}
