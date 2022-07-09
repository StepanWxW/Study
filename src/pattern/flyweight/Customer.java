package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public static void main(String[] args) {
        WorkerFactory factory = new WorkerFactory();
        List<Worker> workerList = new ArrayList<>();
        workerList.add(factory.getWorkerBySpecialty("Sales"));
        workerList.add(factory.getWorkerBySpecialty("Sales"));
        workerList.add(factory.getWorkerBySpecialty("Loader"));
        workerList.add(factory.getWorkerBySpecialty("Loader"));
        workerList.add(factory.getWorkerBySpecialty("Sales"));
        for (Worker w : workerList){
            w.doWorker();
        }
    }
}
