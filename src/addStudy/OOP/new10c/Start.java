package addStudy.OOP.new10c;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array = new int[]{12, 30, 45, 64, 12, 323, 11};
        long startTime = System.nanoTime();
        Sort bubble = new BubbleSort();
        bubble.sort(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
        bubble.getName();
        QuickSort quick = new QuickSort();
        quick.sort(array,0,6);
        System.out.println(Arrays.toString(array));
        Sort select = new SelectSort();
        select.sort(array);
    }
}
