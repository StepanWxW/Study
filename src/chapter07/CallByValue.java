package chapter07;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a=15, b=20;
        System.out.println("a and b before get: " +a +" " +b);
        ob.meth (a,b);
        System.out.println("a and b after get: " +a +" " +b);
    }
}
