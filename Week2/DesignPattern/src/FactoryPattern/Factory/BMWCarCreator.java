package FactoryPattern.Factory;

import FactoryPattern.Body.BMWBody;
import FactoryPattern.Body.Body;
import FactoryPattern.Car.BMWCar;
import FactoryPattern.Car.Car;
import FactoryPattern.CoolingSystem.BMWCoolingSystem;
import FactoryPattern.CoolingSystem.CoolingSystem;
import FactoryPattern.Engine.BMWEngine;
import FactoryPattern.Engine.Engine;
import FactoryPattern.Factory.CarCreator;
import FactoryPattern.FuelSystem.BMWFuelSystem;
import FactoryPattern.FuelSystem.FuelSystem;
import FactoryPattern.MusicSystem.BMWMusicSystem;
import FactoryPattern.MusicSystem.MusicSystem;
import FactoryPattern.Wheel.BMWWheel;
import FactoryPattern.Wheel.Wheel;

public class BMWCarCreator extends CarCreator {
    @Override
    public Car factoryMethod() {
        Body BMWBody = new BMWBody();
        CoolingSystem BMWCoolingSystem = new BMWCoolingSystem();
        Engine BMWEngine = new BMWEngine();
        FuelSystem BMWFuelSystem = new BMWFuelSystem();
        Wheel BMWWheel = new BMWWheel();
        MusicSystem BMWMusicSystem = new BMWMusicSystem();
        return new BMWCar(BMWBody, BMWCoolingSystem, BMWEngine, BMWFuelSystem, BMWWheel, BMWMusicSystem);
    }
}
