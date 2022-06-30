package Thread.lesson1v3;

public class Start {
    public static void main(String[] args) {
        Foo foo= new Foo();
        new Thread(foo::thirdwork).start();
        new Thread(foo::secondwork).start();
        new Thread(foo::firstwork).start();
        }
    }

