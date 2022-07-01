package Thread.lesson1v4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static Thread.lesson1v4.Barrier.BARRIER;


class Barrier {

    public static final CyclicBarrier BARRIER = new CyclicBarrier(3, new BarrierWork());
}
class BarrierWork implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " бАРЬЕЬ");
        System.out.println(Thread.currentThread().getName() + " бАРЬЕЬ");
    }
}

class FooWorkFirst implements Runnable {
    Foo foo = new Foo();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            BARRIER.await();
        }  catch (BrokenBarrierException | InterruptedException e) {
            System.out.println("Барьер на первом методе выбросил ошибку");
        }
        foo.first();
    }
}
class FooWorkSecond implements Runnable {
    Foo foo = new Foo();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            BARRIER.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println("Барьер на первом методе выбросил ошибку");
        }
        foo.second();
    }
}
class FooWorkThird implements Runnable {
    Foo foo = new Foo();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            BARRIER.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println("Барьер на первом методе выбросил ошибку");
        }
        foo.third();
    }
}
public class Foo {
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
