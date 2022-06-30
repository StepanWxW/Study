package Thread.lesson1v2;

public class Foo {
    private volatile int orderNum = 1;
    public void first() {
        synchronized (this) {
            while (orderNum != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            orderNum = 2;
            System.out.print("first");
            notifyAll();
        }
    }
    public void second() {
        synchronized (this) {
            while (orderNum != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            orderNum = 3;
            System.out.print("second");
            notifyAll();
        }
    }
    public void third() {
            synchronized (this) {
                while (orderNum != 3) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
        System.out.print("third");
    }
}
