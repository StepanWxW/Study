package Thread;

public class People {
    public static void main(String[] args) {

        MyThread t2 = new MyThread();
        Thread thread = new Thread((Runnable) t2);
        thread.start();
    }
}
