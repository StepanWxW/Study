package pattern.builder;

public class Car {
    private String name;
    private Model model;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}
