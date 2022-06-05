package chapter10;

public class ThrowsDemo {
    static void trowsOne() throws IllegalAccessException {
        System.out.println("В теле метода trowsOne()");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            trowsOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
