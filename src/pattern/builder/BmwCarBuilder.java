package pattern.builder;

public class BmwCarBuilder extends CarBuilder{
    @Override
    void buildName() {
        car.setName("BMW");
    }

    @Override
    void buildModel() {
        car.setModel(Model.SEDAN);
    }

    @Override
    void buildPrice() {
        car.setPrice(9800);
    }
}
