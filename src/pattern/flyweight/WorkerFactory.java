package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> workers = new HashMap<>();
    public Worker getWorkerBySpecialty(String specialty) {
        Worker worker = workers.get(specialty);
        if (worker == null) {
            switch (specialty) {
                case "Sales":
                    System.out.println("Нанимаем рабочего продавца");
                    worker = new SalesWorker();
                    break;
                case "Loader":
                    System.out.println("Нанимаем рабочего грузчика");
                    worker = new LoaderWorker();
                    break;
            }
            workers.put(specialty,worker);
        } return worker;
    }
}
