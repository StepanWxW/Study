package Thread.lesson2;

import java.util.Scanner;
import java.util.concurrent.Phaser;

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

public class Start {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        FizzBuzz fz = new FizzBuzz(number);
        MyPhaser phsr = new MyPhaser(1,number);
        new MyThreadFizz(phsr, fz);
        new MyThreadFizzBuzz(phsr, fz);
        new MyThreadBuzz(phsr, fz);
        new MyThreadNumber(phsr, fz);
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
    }
}