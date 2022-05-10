package chapter07;

public class OverLoad1 {
    public static void main(String[] args) {
        OverLoadDemo1 ob = new OverLoadDemo1();
        int i = 88;

        ob.test1();
        ob.test1(10,20);
        ob.test1(i);
        ob.test1(123.2);
    }
}
