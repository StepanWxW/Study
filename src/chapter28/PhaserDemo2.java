package chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhaser;
    MyPhaser (int parties, int phaseCount) {
        super(parties);
        numPhaser = phaseCount - 1;
    }
    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Фаза " + p +" завершена");
        if (p == numPhaser || regParties == 0) return true;
        return false;
    }
}
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1,4);
        System.out.println("Запуск потоков\n");
        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Синхронизатор фаз завершен.");
    }
}
class MyThread3 implements Runnable {
    Phaser phsr;
    String name;
    MyThread3 (Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);;
        }
    }
}
