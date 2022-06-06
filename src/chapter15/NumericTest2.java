package chapter15;

public interface NumericTest2 {
    boolean test(int n, int d);
}
class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isEven = (n, d) -> (n % d) == 0;

        if (isEven.test(10, 2)) System.out.println("Число 2 является множителем числа 10");
        if (!isEven.test(10, 3)) System.out.println("Число 3 не является множителем числа 10");
    }
}