package chapter19.study;

import java.util.Arrays;

public class Array {
    int[] array = new int[]{1, 4, 10, 3, 6, 8, 15};
    int[] search(int num, int[] array) {
        int[] arrayForReturn = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int y = i + 1; y < array.length; y++) {
                if (num == array[i] + array[y]) {
                    arrayForReturn[0] = i;
                    arrayForReturn[1] = y;
                }
            }
        }return arrayForReturn;
    }
}
class start {
    public static void main(String[] args) {
    Array start = new Array();
    int[] a = start.search(25, start.array);
        System.out.println(Arrays.toString(a));
    }
}
