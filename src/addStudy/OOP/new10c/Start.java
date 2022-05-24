package addStudy.OOP.new10c;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array = new int[5000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.round((Math.random() * 1000));
            }
        Sort bubble = new BubbleSort();
        Sort quick = new QuickSort();
        Sort select = new SelectSort();
        Time time = new Time();
        time.stasticTime(bubble, array);
        time.stasticTime(quick, array);
        time.stasticTime(select, array);
    }
}
