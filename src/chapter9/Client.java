package chapter9;

public class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Method callback(), " + p);
    }
    void nonIFaceMeth() {
        System.out.println("nonIFaceMeth method");
    }
}

