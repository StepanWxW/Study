package pattern.abstractfactory;

import pattern.abstractfactory.lada.LadaCreateCar;
import pattern.abstractfactory.lexus.LexusCreateCar;

public class Car {
    public static void main(String[] args) {
        CreateCar carLexus = new LexusCreateCar();
        CarBody body = carLexus.createBody();
        CarEngine engine = carLexus.createEngine();
        CarWheels wheels = carLexus.createWheels();
        body.body();
        engine.engine();
        wheels.wheels();

        CreateCar carLada = new LadaCreateCar();
        CarBody bodyLada = carLada.createBody();
        CarEngine engineLada = carLada.createEngine();
        CarWheels wheelsLada = carLada.createWheels();
        bodyLada.body();
        engineLada.engine();
        wheelsLada.wheels();
    }
}
