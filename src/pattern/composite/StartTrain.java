package pattern.composite;

public class StartTrain {
    public static void main(String[] args) {
        Train rain = new Train();

        TrainCar firstTC = new PeopleTrainCar();
        TrainCar secondTC = new PeopleTrainCar();
        TrainCar thirdTC = new RestranTrainCar();
        TrainCar fourthTC = new PeopleTrainCar();
        TrainCar fifthTC = new TreeTrainCar();

        rain.add(firstTC);
        rain.add(secondTC);
        rain.add(thirdTC);
        rain.add(fourthTC);
        rain.add(fifthTC);

        rain.start();
    }
}
