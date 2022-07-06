package pattern.abstractfactory.lexus;

import pattern.abstractfactory.CarBody;

public class LexusCarBody implements CarBody {
    @Override
    public void body() {
        System.out.println("Создали кузов для Лексуса");
    }
}
