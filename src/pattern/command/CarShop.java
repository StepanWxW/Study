package pattern.command;

public class CarShop {
    public static void main(String[] args) {
        Database database = new Database();
        Consumer consumer = new Consumer(
                new BuyCar(database),
                new SellCar(database),
                new FixCar(database),
                new UpdateCar(database)
        );
        consumer.buyRecord();
        consumer.sellRecord();
        consumer.fixRecord();
        consumer.updateRecord();
    }
}
