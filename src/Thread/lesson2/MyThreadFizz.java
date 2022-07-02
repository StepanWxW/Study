package Thread.lesson2;

import java.util.concurrent.Phaser;

class MyThreadFizz implements Runnable {
    Phaser phsr;
    FizzBuzz fz;
    MyThreadFizz (Phaser p, FizzBuzz fizzB) {
        phsr = p;
        fz = fizzB;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            if (!(phsr.getPhase()%5 == 0 && phsr.getPhase()%3 ==0)){
                if(phsr.getPhase()%3 == 0) fz.fizz();
            }
            phsr.arriveAndAwaitAdvance();
        }
    }
}