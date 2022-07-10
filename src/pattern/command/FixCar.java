package pattern.command;

public class FixCar implements Command{
    Database database;

    public FixCar(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.fix();
    }
}
