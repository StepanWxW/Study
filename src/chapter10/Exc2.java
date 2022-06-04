package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int a,b;
        try {
            a = 0;
            b = 10 / 0;
            System.out.println("Это не будет выводиться");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
            System.out.println("Выводиться в любом случае.");
    }
}
