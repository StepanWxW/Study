package pattern.singleton;

public class Start {
    public static void main(String[] args) {

        Audi.getAudi().addBody("Прикрутить капот");
        Audi.getAudi().addBody("Установить двигатель");
        Audi.getAudi().addBody("Покрасить авто");
        Audi.getAudi().showBodyAudi();
    }
}
