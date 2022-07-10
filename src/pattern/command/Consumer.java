package pattern.command;

public class Consumer {
    Command buy;
    Command sell;
    Command fix;
    Command update;

    public Consumer(Command buy, Command sell, Command fix, Command update) {
        this.buy = buy;
        this.sell = sell;
        this.fix = fix;
        this.update = update;
    }
    public void buyRecord(){
        buy.execute();
    }
    public void sellRecord(){
        sell.execute();
    }
    public void fixRecord(){
        fix.execute();
    }
    public void updateRecord(){
        update.execute();
    }
}
