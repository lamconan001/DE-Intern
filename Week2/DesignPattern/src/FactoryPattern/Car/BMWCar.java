package FactoryPattern.Car;

import FactoryPattern.Body.Body;
import FactoryPattern.Car.Car;
import FactoryPattern.CoolingSystem.CoolingSystem;
import FactoryPattern.Engine.Engine;
import FactoryPattern.FuelSystem.FuelSystem;
import FactoryPattern.MusicSystem.BMWMusicSystem;
import FactoryPattern.MusicSystem.MusicSystem;
import FactoryPattern.Wheel.Wheel;

public class BMWCar extends Car {
    private MusicSystem BMWMusicSystem = new BMWMusicSystem();

    public BMWCar(Body body, CoolingSystem coolingSystem, Engine engine, FuelSystem fuelSystem, Wheel wheel, MusicSystem BMWMusicSystem) {
        super(body, coolingSystem, engine, fuelSystem, wheel);
        this.BMWMusicSystem = BMWMusicSystem;
    }
}
