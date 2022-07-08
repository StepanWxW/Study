package pattern.builder;

public class Buyer {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    Car builderCAr() {
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildModel();
        carBuilder.buildPrice();

        Car car = carBuilder.getCar();
        return car;
    }
}
