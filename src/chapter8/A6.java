package chapter8;

abstract class A6 {
    abstract void callme();

    void callmetoo () {
        System.out.println("This specific method");
    }
}
class B6 extends A6 {
    void callme() {
        System.out.println("Method callme() on B");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        B6 b = new B6();
        b.callme();
        b.callmetoo();
    }
}
