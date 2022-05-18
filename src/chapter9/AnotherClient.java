package chapter9;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Other variant method callback()");
        System.out.println("P squared is: " + (p*p));
    }
}
