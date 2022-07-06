package pattern.abstractfactory.lada;

import pattern.abstractfactory.CarWheels;

public class LadaCarWheels implements CarWheels {
    @Override
    public void wheels() {
        System.out.println("Создали колеса для Лады.");
    }
}
