package addStudy.OOP.new10b;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array = new int[]{12, 30, 45, 64, 12, 323, 11};
        Sort bubble = new BubbleSort();
        bubble.sort(array);
        bubble.getName();
        QuickSort quick = new QuickSort();
        quick.sort(array,0,6);
        System.out.println(Arrays.toString(array));
        Sort select = new SelectSort();
        select.sort(array);
    }
}
