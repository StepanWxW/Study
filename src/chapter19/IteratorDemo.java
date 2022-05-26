package chapter19;

import java.util.*;


public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("F");
        al.add("D");
        System.out.println("Исходное содержимео списочного массива al: ");
        Iterator<String> itr =al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Измененое содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Измененный в обратном порядке список al: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
