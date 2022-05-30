package chapter19.study;
import java.util.*;
public class Lesson2v2 {
    void search(List<Integer> listIn) {
        int sizeList = listIn.size();
        HashSet<Integer> hs = new HashSet<>(listIn);
        int sizeHs = hs.size();
        int calc = sizeList - sizeHs + 1;
        System.out.println("Есть число которое повторяется: " + calc + " раза.");
// Но поиск числа (а именно какое, через Hashset я не знаю как сделать, только через ArrayList).
    }
}
class start2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(15);
        Lesson2v2 start = new Lesson2v2();
        start.search(list);
    }
}