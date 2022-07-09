package pattern.facade;

public class LineFlag {

    private boolean flag;
    public boolean isFlag() {
        return flag;
    }
    public void startSpring(){
        System.out.println("Линия запущена и работает");
        flag = true;
    }
    public void finishSpring(){
        System.out.println("Линия выключена");
        flag = false;
    }
}
