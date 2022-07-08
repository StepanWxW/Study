package pattern.bridge;


public abstract class Conveyor {
    protected Model model;

    public Conveyor(Model model) {
        this.model = model;
    }
    public abstract void modelCar();
}
