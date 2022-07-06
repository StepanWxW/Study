package pattern.abstractfactory.lexus;

import pattern.abstractfactory.CarWheels;

public class LexusCarWheels implements CarWheels {
    @Override
    public void wheels() {
        System.out.println("Создали колеса для Лексуса.");
    }
}
