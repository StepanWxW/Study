package chapter19.study;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {


    int[] search(int num, ArrayList<Integer> listIn) {
        int[] arrayForReturn = new int[2];
        for (int i = 0; i < listIn.size() - 1; i++) {
            for (int y = i + 1; y < listIn.size(); y++) {
                if (num == listIn.get(i) + listIn.get(y)) {
                    arrayForReturn[0] = i;
                    arrayForReturn[1] = y;
                }
            }
        }return arrayForReturn;
    }
}
class start1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(15);

        Array2 start = new Array2();
        int[] a = start.search(25, list);
        System.out.println(Arrays.toString(a));
    }
}