package Thread.lesson1v5;

import java.util.concurrent.Phaser;

class Foo {
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
class MyPhaser extends Phaser {
    int numPhaser;
    MyPhaser (int parties, int phaseCount) {
        super(parties);
        numPhaser = phaseCount;
    }
    protected boolean onAdvance(int p, int regParties) {
        return p == numPhaser || regParties == 0;
    }
}
public class PhaserVersion {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1,4);
        new MyThreadFoo3(phsr);
        new MyThreadFoo2(phsr);
        new MyThreadFoo1(phsr);
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
    }
}
class MyThreadFoo3 implements Runnable {
    Phaser phsr;
    Foo foo = new Foo();
    MyThreadFoo3 (Phaser p) {
        phsr = p;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            if(phsr.getPhase() == 3) foo.third();
            phsr.arriveAndAwaitAdvance();
        }
    }

}
class MyThreadFoo2 implements Runnable {
    Phaser phsr;

    Foo foo = new Foo();
    MyThreadFoo2 (Phaser p) {
        phsr = p;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            if(phsr.getPhase() == 2) foo.second();
            phsr.arriveAndAwaitAdvance();
        }
    }
}
class MyThreadFoo1 implements Runnable {
    Phaser phsr;
    Foo foo = new Foo();
    MyThreadFoo1 (Phaser p) {
        phsr = p;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            if(phsr.getPhase() == 1) foo.first();
            phsr.arriveAndAwaitAdvance();
        }
    }
}
