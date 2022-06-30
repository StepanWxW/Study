package Thread.lesson1v2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Work {
    Foo foo = new Foo();
    private static volatile int orderNum = 1;
    public void start(){
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (this) {
                while (orderNum != 1) {
                    try {
                        wait(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                foo.first();
                orderNum = 2;
            }
        }
    });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    while (orderNum != 2) {
                        try {
                            wait(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    foo.second();
                    orderNum = 3;
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    while (orderNum != 3) {
                        try {
                            wait(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                        foo.third();
                    }
                }
        });
        thread3.start();
        thread2.start();
        thread1.start();
    }
}
