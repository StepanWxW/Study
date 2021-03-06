package chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
        double productofSqrtRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a*b);
        System.out.println("произведение квадратных корней: " + productofSqrtRoots);
    }
}
