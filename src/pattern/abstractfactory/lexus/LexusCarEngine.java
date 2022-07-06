package pattern.abstractfactory.lexus;

import pattern.abstractfactory.CarEngine;

public class LexusCarEngine implements CarEngine {
    @Override
    public void engine() {
        System.out.println("Создали двигатель для Лексуса");
    }
}
