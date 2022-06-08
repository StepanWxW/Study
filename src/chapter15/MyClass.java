package chapter15;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    private int val;
    MyClass (int v) {
        val = v;
    }
    int getVal () {
        return val;
    }
}
class UseMethodRef {
    static int compareMC (MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> mc = new ArrayList<MyClass>();
        mc.add(new MyClass(1));
        mc.add(new MyClass(4));
        mc.add(new MyClass(2));
        mc.add(new MyClass(9));
        mc.add(new MyClass(3));
        mc.add(new MyClass(7));
        MyClass maxValObj = Collections.max(mc,UseMethodRef::compareMC);
        System.out.println("Максимально значение в коллекции: " + maxValObj.getVal());
    }
}

