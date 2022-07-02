package Thread.lesson2;

import java.util.concurrent.Phaser;

public class MyThreadNumber implements Runnable {
    Phaser phsr;
    FizzBuzz fz;
    MyThreadNumber (Phaser p, FizzBuzz fizzB) {
        phsr = p;
        fz = fizzB;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {

        while (!phsr.isTerminated()) {
            fz.number();
            if (!(phsr.getPhase()%5 == 0 || phsr.getPhase()%3 ==0))
                System.out.println(fz.count);
            phsr.arriveAndAwaitAdvance();
        }
    }
}
