package chapter07;

public class OverLoadDemo1 {
    void test1() {
        System.out.println("Параметры отсутствуют");
    }

    void test1(int a) {
        System.out.println("a: " + a);
    }

    void test1(int a, int b) {
        System.out.println("a + b " + a + " " + b);
    }

    void test1(double a) {
        System.out.println("Внутреннее преобразование при вызове " + "test(double) a: "+ a);

    }
}

