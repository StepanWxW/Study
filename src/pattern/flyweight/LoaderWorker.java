package pattern.flyweight;

public class LoaderWorker implements Worker{
    @Override
    public void doWorker() {
        System.out.println("Грузчик, который таскает.");
    }
}
