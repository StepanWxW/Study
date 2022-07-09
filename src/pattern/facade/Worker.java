package pattern.facade;

public class Worker {
    public void doWork(LineFlag flag) {
        if (flag.isFlag()) {
            System.out.println("Работает на линии и собирает авто");
        } else System.out.println("Курит, ждет пока включат линию.");
    }
}
