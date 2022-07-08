package pattern.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.setCarBuilder(new MercedesCarBuilder());
        Car car = b.builderCAr();
        System.out.println(car);
    }
}
