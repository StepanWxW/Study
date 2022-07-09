package pattern.chain;

public class GrantaLuxe extends Lada{
    public GrantaLuxe(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Установили люк" + message);
    }

}
