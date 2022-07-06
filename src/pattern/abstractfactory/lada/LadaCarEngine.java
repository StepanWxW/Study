package pattern.abstractfactory.lada;

import pattern.abstractfactory.CarEngine;

public class LadaCarEngine implements CarEngine {
    @Override
    public void engine() {
        System.out.println("Создали двигатель для Лады.");
    }
}
