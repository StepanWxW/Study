package pattern.command;

public class UpdateCar implements Command{
    Database database;

    public UpdateCar(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
