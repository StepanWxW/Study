package chapter9;

import java.util.Random;

interface SharedContacts {
    int No = 0;
    int Yes = 1;
    int Maybe = 2;
    int Later = 3;
    int Soon = 4;
    int Never = 5;
}
class Question implements SharedContacts {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100*rand.nextDouble());
        if (prob<30)
            return No;
        if (prob <60)
            return Yes;
        if (prob<75)
            return Later;
        if (prob<98)
            return Soon;
        else return Never;
    }
}
class AskMe implements SharedContacts {
    static void answer(int result) {
        switch (result) {
            case No:
                System.out.println("No");
                break;
            case Yes:
                System.out.println("Yes");
                break;
            case Maybe:
                System.out.println("Maybe");
                break;
            case Later:
                System.out.println("Later");
                break;
            case Soon:
                System.out.println("Soon");
            case Never:
                System.out.println("Never");
        }
    }

    public static void main(String[] args) {
        Question q= new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}