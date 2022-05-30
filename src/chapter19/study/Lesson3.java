package chapter19.study;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        Work start = new Work();
        System.out.println(Arrays.toString(start.array));

    }
}
class Work {
    int[] addToArray(int[] arrayIn) {
        return arrayIn;
    }

    int[] array = new int[(int) Math.round((Math.random() * 15) +5)];
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
        }
    }
}
