package chapter9;

class A {
    public interface NestedIf {
        boolean isNotNegative (int x);
    }
}
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("Number 10 is positive");
        if(nif.isNotNegative(-12))
            System.out.println("Number -12 is negative");
    }
}
