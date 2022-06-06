package chapter15;

public interface MyNumber {
    double getValue();
}
class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("Случайное число: " + myNum.getValue());
        System.out.println("Случайное число: " + myNum.getValue());
    }
}