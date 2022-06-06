package chapter13;

import org.omg.CORBA.Object;

public class A {
    int i, j;
}
class B {
    int i, j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}
class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("а является экземпляром А");
        if (b instanceof B)
            System.out.println("b является экземпляром B");
        if (c instanceof C)
            System.out.println("c является экземпляром C");
        if (c instanceof A)
            System.out.println("c является экземпляром А");

        if (a instanceof C)
            System.out.println("а можно привести к типу С");
        System.out.println();
        A ob;
        ob = d;
        if (ob instanceof D)
            System.out.println("ob является экземпляром D");
        System.out.println();
        ob = c;
        if (ob instanceof C)
            System.out.println("ob является экземпляром C");

        if (ob instanceof D)
            System.out.println("ob можно привести к D");
        else System.out.println("ob нельзя привестик D");
        if (ob instanceof A)
            System.out.println("ob можно привести к A");
        System.out.println();
        if (a instanceof Object)
            System.out.println("a можно привести к типу Object");
        if (b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if (c instanceof Object)
            System.out.println("c можно привести к типу Object");
        if (d instanceof Object)
            System.out.println("d можно привести к типу Object");
    }
}
