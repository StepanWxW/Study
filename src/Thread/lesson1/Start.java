package Thread.lesson1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.third();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.second();
            }
        });
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                foo.first();
            }
        });
        thr1.start();
        thr1.join();
        thr2.start();
        thr2.join();
        thr3.start();
        thr3.join();
    }
}
