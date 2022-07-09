package pattern.flyweight;

public class SalesWorker implements Worker{
    @Override
    public void doWorker() {
        System.out.println("Продает запчасти.");
    }
}
