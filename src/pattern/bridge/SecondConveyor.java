package pattern.bridge;

public class SecondConveyor extends Conveyor{
    public SecondConveyor(Model model) {
        super(model);
    }

    @Override
    public void modelCar() {
        System.out.println("Работает ВТОРОЙ конвеер и изготавливает: ");
        model.crateModel();
    }
}
