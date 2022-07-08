package pattern.prototype;

public class CarProjectFactory {
    CarProject car;

    public CarProjectFactory(CarProject car) {
        this.car = car;
    }

    public void setCar(CarProject car) {
        this.car = car;
    }
    CarProject cloneCarProject() {
        return (CarProject) car.copy();
    }
}
