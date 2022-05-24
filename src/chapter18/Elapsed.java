package chapter18;

public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Измерение времени перебора от 0 до 1 000 000 00");
        start = System.currentTimeMillis();
        for (int i=0; i<100000000L; i++);
        end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end-start));
    }
}
