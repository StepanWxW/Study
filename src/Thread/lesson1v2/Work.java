package Thread.lesson1v2;


public class Work {
    Foo foo = new Foo();
    public void start(){
    Thread thread1 = new Thread(() -> foo.first());
        Thread thread2 = new Thread(() -> foo.second());
        Thread thread3 = new Thread(() -> foo.third());
        thread3.start();
        thread2.start();
        thread1.start();
    }
}
