package addStudy.OOP.new10b;

import java.util.Arrays;

public class BubbleSort implements Sort{
    String name;
    @Override
    public int[] sort(int[] array) {
        boolean check = false;
        int buf = 0;
        while (!check) {
            check = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    check = false;
                    buf = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buf;
                }

            }
        }System.out.println(Arrays.toString(array));
        return array;
    }
    @Override
    public String getName() {
        name = "Bubble";
        return name;
    }
}

