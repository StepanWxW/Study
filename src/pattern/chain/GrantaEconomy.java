package pattern.chain;

public class GrantaEconomy extends Lada{
    public GrantaEconomy(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Создали ладу гранту в эконом варианте." + message);
    }
}
