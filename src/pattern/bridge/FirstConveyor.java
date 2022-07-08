package pattern.bridge;

public class FirstConveyor extends Conveyor{
    public FirstConveyor(Model model) {
        super(model);
    }

    @Override
    public void modelCar() {
        System.out.println("Работает первый конвеер и изготавливает: ");
        model.crateModel();
    }
}
