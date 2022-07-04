package pattern.factory;

public class Vesta implements Lada{
    @Override
    public void create() {
        System.out.println("Создали Весту.");
    }
}
