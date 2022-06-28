package chapter11;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class NewThread4 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    NewThread4 (String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlag = false;
        t.start();
    }
    public void run() {
        try {
            for (int i=15; i>0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
    synchronized void mysuspend () {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("Один");
        NewThread4 ob2 = new NewThread4("Два");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобнавление потока один");
            ob2.mysuspend();
            System.out.println("Приостановка потока два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобнавление потока два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
