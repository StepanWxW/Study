package pattern.composite;

public class PeopleTrainCar implements TrainCar {
    @Override
    public void body() {
        System.out.println("Вагон с людьми.");
    }
}
