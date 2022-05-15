package chapter8;

class A2 {
     A2() {
        System.out.println("In constructor: A");
    }
}
class B2 extends A2 {
    B2 () {
        System.out.println("In constructor: B");
    }
}
class C2 extends B2 {
    C2 () {
        System.out.println("In constructor: C");
    }
}
class CollingCons {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}