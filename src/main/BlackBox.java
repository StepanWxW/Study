package main;

public class BlackBox {
    public static void main(String[] args) {
        DemoBlackBox d1 = new DemoBlackBox(1,2);
        DemoBlackBox d2 = new DemoBlackBox(1,2);
        System.out.println(d1.equals(d2));
        System.out.println(d1 == d2);
        System.out.println(d1.name == d1.name1);
        System.out.println(d1.name.equals(d1.name1));
    }
}
