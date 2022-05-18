package chapter9;

public class TestIFAce {
    public static void main(String[] args) {
        Callback c =  new Client();
        c.callback(42);
    }
}
