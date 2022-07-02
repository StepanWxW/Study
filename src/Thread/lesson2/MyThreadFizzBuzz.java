package Thread.lesson2;

import java.util.concurrent.Phaser;

class MyThreadFizzBuzz implements Runnable {
    Phaser phsr;
    FizzBuzz fz;
    MyThreadFizzBuzz (Phaser p, FizzBuzz fizzB) {
        phsr = p;
        fz = fizzB;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            if (!(phsr.getPhase() == 0)) {
                if (phsr.getPhase() % 5 == 0 && phsr.getPhase() % 3 == 0) fz.fizzbuzz();
            }
            phsr.arriveAndAwaitAdvance();
        }
    }
}