package pattern.facade;

public class Facade {
    void facadeLine() {
        CarLine carLine = new CarLine();
        LineFlag lineFlag = new LineFlag();
        Worker worker = new Worker();
        carLine.lineWork();
        lineFlag.startSpring();
        worker.doWork(lineFlag);
    }
}
