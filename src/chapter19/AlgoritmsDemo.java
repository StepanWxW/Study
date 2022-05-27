package chapter19;

import java.util.*;

public class AlgoritmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(-8);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("Список отсортирован в обратномпорядке: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        Collections.shuffle(ll);
        System.out.println("Список перетусован: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Мксимум: " + Collections.max(ll));
    }
}
