package Thread.lesson1v3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    static volatile int orderNum = 1;
    private Semaphore sem = new Semaphore(1);
    private Lock lock = new ReentrantLock();

    public void firstwork() {
        while (orderNum != 1) {
//            try {
//                sem.acquire();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
            first();
            orderNum = 2;
//            sem.release();
        }

    public void secondwork() {
        while (orderNum != 2) {

       }

            second();
            orderNum = 3;
//            sem.release();
        }

    public void thirdwork() {
        while (orderNum != 3) {
//            try {
//                sem.acquire();
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

            third();
//        sem.release();
        }

    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}