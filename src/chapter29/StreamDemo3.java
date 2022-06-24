package chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        double productofSqrtRoots = myList.parallelStream().reduce(1.0, (a,b) -> a*Math.sqrt(b), (a,b) ->a*b);
        System.out.println("произведение квадратных корней: " + productofSqrtRoots);
    }
}
