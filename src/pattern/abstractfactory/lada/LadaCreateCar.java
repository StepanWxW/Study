package pattern.abstractfactory.lada;

import pattern.abstractfactory.CarBody;
import pattern.abstractfactory.CarEngine;
import pattern.abstractfactory.CarWheels;
import pattern.abstractfactory.CreateCar;

public class LadaCreateCar implements CreateCar {
    @Override
    public CarBody createBody() {
        return new LadaCarBody();
    }

    @Override
    public CarEngine createEngine() {
        return new LadaCarEngine();
    }

    @Override
    public CarWheels createWheels() {
        return new LadaCarWheels();
    }
}
