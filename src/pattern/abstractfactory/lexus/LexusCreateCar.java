package pattern.abstractfactory.lexus;

import pattern.abstractfactory.CarBody;
import pattern.abstractfactory.CarEngine;
import pattern.abstractfactory.CarWheels;
import pattern.abstractfactory.CreateCar;

public class LexusCreateCar implements CreateCar {
    @Override
    public CarBody createBody() {
        return new LexusCarBody();
    }

    @Override
    public CarEngine createEngine() {
        return new LexusCarEngine();
    }

    @Override
    public CarWheels createWheels() {
        return new LexusCarWheels();
    }
}
