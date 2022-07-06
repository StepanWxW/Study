package pattern.abstractfactory.lada;

import pattern.abstractfactory.CarBody;

public class LadaCarBody implements CarBody {
    @Override
    public void body() {
        System.out.println("Создали кузов для Лады.");
    }
}
