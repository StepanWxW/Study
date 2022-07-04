package pattern.factory;

public class Largus implements Lada {

    @Override
    public void create() {
        System.out.println("Создали Ларгус.");
    }
}
