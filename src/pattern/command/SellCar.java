package pattern.command;

public class SellCar implements Command{
    Database database;

    public SellCar(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.sell();
    }
}
