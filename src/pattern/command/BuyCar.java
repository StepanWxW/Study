package pattern.command;

public class BuyCar implements Command{
    Database database;

    public BuyCar(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.buy();
    }
}
