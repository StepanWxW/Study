package pattern.abstractfactory;

public interface CreateCar {
    CarBody createBody();
    CarEngine createEngine();
    CarWheels createWheels();
}
