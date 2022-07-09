package pattern.chain;

public class GrantaNormal extends Lada{
    public GrantaNormal(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Добавили кондиционер." + message);
    }

}
