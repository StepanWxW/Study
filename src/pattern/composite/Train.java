package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<TrainCar> trainCars = new ArrayList<>();


    public void add(TrainCar TC) {
        trainCars.add(TC);
    }

    public void start() {
        System.out.println("Поезд состоит: ");
        for(TrainCar t : trainCars) {
            t.body();
        }
    }
}
