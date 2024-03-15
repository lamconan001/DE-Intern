package FactoryPattern;
import FactoryPattern.Car.Car;
import FactoryPattern.Factory.BMWCarCreator;
import FactoryPattern.Factory.StandartCarCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryDemo {
    public static void main(String[] args) {
        StandartCarCreator standartCarCreator = new StandartCarCreator();
        BMWCarCreator bmwCarCreator = new BMWCarCreator();

        List<Car> carOrder = new ArrayList<Car>(Arrays.asList(standartCarCreator.factoryMethod(), bmwCarCreator.factoryMethod()));
    }
}
