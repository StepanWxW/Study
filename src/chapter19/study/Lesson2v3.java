package chapter19.study;
import java.util.*;
public class Lesson2v3 {
    void search(Set<Integer> listIn) {
        int sizeList = listIn.size();
        HashSet<Integer> hs = new HashSet<>(listIn);
        int sizeHs = hs.size();
        int calc = sizeList - sizeHs + 1;
        System.out.println("Есть число которое повторяется: " + calc + " раза.");
// Но поиск числа (а именно какое, через Hashset я не знаю как сделать, только через ArrayList).

    }
}
class start3 {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(15);
        Lesson2v3 start = new Lesson2v3();
        start.search(list);
    }
}