package Thread.lesson1v2;

public class Work {
    Foo foo = new Foo();
    private volatile int orderNum = 1;
    public void start(){
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (this) {
                while (orderNum != 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                foo.first();
                orderNum = 2;
                notifyAll();
            }
        }
    });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    while (orderNum != 2) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    foo.second();
                    orderNum = 3;
                    notifyAll();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    while (orderNum != 3) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                        foo.third();
                        notifyAll();
                        orderNum = 1;
                    }
                }
        });
        thread3.start();
        thread1.start();
        thread2.start();
    }
}
