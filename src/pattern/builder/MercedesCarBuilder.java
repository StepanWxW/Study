package pattern.builder;

public class MercedesCarBuilder extends CarBuilder{
    @Override
    void buildName() {
        car.setName("Mercedes");
    }

    @Override
    void buildModel() {
        car.setModel(Model.UNIVERSAL);
    }

    @Override
    void buildPrice() {
        car.setPrice(11120);
    }
}
