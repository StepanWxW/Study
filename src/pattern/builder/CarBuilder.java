package pattern.builder;

public abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }
    abstract void buildName();
    abstract void buildModel();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
