package addStudy.OOP.new10b;

import java.util.Arrays;

public class QuickSort implements Sort{
    String name;

    @Override
    public int[] sort(int[] array) {
        return sort1(array, 0, array.length);
    }

    public int[] sort1(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            sort1(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sort1(array, leftBorder, rightMarker);
        }
        System.out.println("Quick");
        return array;

    }

    @Override
    public String getName() {
        name ="Quick";
        return name;
    }

}