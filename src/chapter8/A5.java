package chapter8;

public class A5 {
    void callme() {
        System.out.println("call is A");
    }
}
class B5 extends A5 {
    void callme () {
        System.out.println("call is B");
    }
}
class C5 extends B5 {
    void callme() {
        System.out.println("call is C");
    }
}
class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();

        A5 r;
        r = a ;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
