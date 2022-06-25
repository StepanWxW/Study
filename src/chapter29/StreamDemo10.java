package chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        Stream<String> myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();
        if (spliterator2 != null) {
            System.out.println("Результат выводимый spliterator2: ");
            spliterator2.forEachRemaining(System.out::println);
        }
        System.out.println("Результат выводимый spliterator: ");
        spliterator.forEachRemaining(System.out::println);
        }
}
