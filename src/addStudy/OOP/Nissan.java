package addStudy.OOP;

import chapter8.A;

public class Nissan extends Auto {
    Auto a = new Auto();
    Nissan() {
        a.setName("Nissan");
        a.setRadius(15);
        a.setMaxSpeed(154.16);
    }


    @Override
    void Characteristics() {
        System.out.println("Characteristics Nissan: \n Name: " + a.getName() + "\n Radius: " + a.getRadius() + "\n maxSpeed: " + a.getMaxSpeed());;
    }
}
