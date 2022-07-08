package pattern.bridge;

public class CarFactory {
    public static void main(String[] args) {
        Conveyor[] conveyors = {
                new SecondConveyor(new Vesta()),
                new FirstConveyor(new Granta())};
        for (Conveyor conveyor : conveyors) {
            conveyor.modelCar();
        }
    }
}
